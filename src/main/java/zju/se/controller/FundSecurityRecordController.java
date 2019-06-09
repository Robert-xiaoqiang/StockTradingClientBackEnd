package zju.se.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zju.se.modelandrepository.*;
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
    @Autowired
    private FundSecurityRepository fundSecurityRepository;
    @Autowired
    private SecurityStockRepository securityStockRepository;
    @Autowired
    private RecordRepository recordRepository;

    @RequestMapping(value = "/myStock", method = RequestMethod.POST)
    public List<SecurityStockResponseBody> getSecurity(
            @RequestBody Map<String, String> httpMessageBody
    )
    {
        String securityId;
        Optional<FundSecurity> ofs = fundSecurityRepository.findById(httpMessageBody.get("userinfo"));
        FundSecurity fs = ofs.orElse(null);
        if(fs == null){
            return null;
        }
        else {
            securityId = fs.getSecurityId();
        }
        List <SecurityStockResponseBody> ssrbs = securityStockRepository.findAllBySecurityId(securityId)
                .stream()
                .map(r -> new SecurityStockResponseBody(r))
                .collect(Collectors.toList());
        System.out.println(httpMessageBody.get("userinfo"));
        System.out.println(securityId);
        System.out.println(ssrbs.isEmpty());

        return ssrbs;
    }
}
