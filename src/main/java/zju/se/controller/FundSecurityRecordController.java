package zju.se.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zju.se.modelandrepository.CapitalAccount;
import zju.se.modelandrepository.CapitalAccountRepository;
import zju.se.modelandrepository.SecurityStockRepository;
import zju.se.modelandrepository.SecurityStockResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;


@CrossOrigin(origins = "*", allowCredentials = "true")
@RestController
@RequestMapping(value = "/api")
public class FundSecurityRecordController {
//  it has no life
//    @Autowired
//    private FundSecurityRepository fundSecurityRepository;
//  it has no life
    @Autowired
    private CapitalAccountRepository capitalAccountRepository;

    @Autowired
    private SecurityStockRepository securityStockRepository;

    @RequestMapping(value = "/myStock", method = RequestMethod.POST)
    public List<SecurityStockResponseBody> getSecurity(
            @RequestBody Map<String, String> httpMessageBody
    )
    {
        String securityId = null;
        List<CapitalAccount> lca = capitalAccountRepository.getAccount(httpMessageBody.get("userinfo"));

        if(lca.size() == 0){
            return null;
        }
        else {
            securityId = lca.get(0).getSecurities_id();

            List<SecurityStockResponseBody> ssrbs = securityStockRepository.findAllBySecurityId(securityId)
                    .stream()
                    .map(r ->
                    {
                        double currentPrice = 10.0;
                        /**
                         * TO-DO
                         * which repository?
                         */
                        return new SecurityStockResponseBody(currentPrice, r);
                    })
                    .collect(Collectors.toList());
            System.out.println(httpMessageBody.get("userinfo"));
            System.out.println(securityId);
            System.out.println(ssrbs.isEmpty());

            return ssrbs;
        }
    }
}
