package zju.se.modelandrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import zju.se.modelandrepository.Record;

public interface RecordRepository extends JpaRepository<Record,Integer>{
    public List<Record> findByFundId(String fundId);
}
