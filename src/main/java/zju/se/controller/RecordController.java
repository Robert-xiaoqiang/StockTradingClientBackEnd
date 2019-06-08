package zju.se.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.transaction.annotation.Transactional;
import zju.se.modelandrepository.Record;
import zju.se.modelandrepository.RecordRepository;
import zju.se.modelandrepository.RecordResponseBody;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:3000",allowCredentials = "true")
@RestController
@RequestMapping(value = "/api")
public class RecordController {
    @Autowired
    private RecordRepository recordRepository;

    @RequestMapping(value = "/record")
    public List <RecordResponseBody> getRecord(
            @RequestParam("userinfo") String fundId
    )
    {
        List <RecordResponseBody> records = recordRepository.findAllByFundId(fundId)
                .stream()
                .map(r -> new RecordResponseBody(r))
                .collect(Collectors.toList());
        return records;
    }
}
