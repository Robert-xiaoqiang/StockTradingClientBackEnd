package zju.se.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.transaction.annotation.Transactional;
import zju.se.modelandrepository.Record;
import zju.se.modelandrepository.RecordRepository;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000",allowCredentials = "true")
@RestController
@RequestMapping(value = "/api")
public class RecordController {
    @Autowired
    private RecordRepository recordRepository;

    @Transactional
    @RequestMapping(value = "/Record")
    public List <Record> getRecord(){
        List <Record> records = recordRepository.findAllByFundId("111");
        //List <Record> records = recordRepository.findAllByAmount(10000);
        return records;
    }
}
