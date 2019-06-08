package zju.se.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zju.se.modelandrepository.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class FundSecurityRecordController {
    @Autowired
    private FundSecurityRepository fundSecurityRepository;
    @Autowired
    private SecurityStockRepository securityStockRepository;
    @Autowired
    private RecordRepository recordRepository;

    @RequestMapping(value = "/")
    public List<Record> getSecurity()
    {
        Optional<FundSecurity> ofs = fundSecurityRepository.findById("11");
        FundSecurity fs = ofs.orElse(null);
        //String securityId = fs.getSecurityId();
        SecurityStock ss = securityStockRepository.findBySecurityId("11").orElse(null);

        List<Record> lr = recordRepository.findByFundId("111");
        return lr;
    }
}
