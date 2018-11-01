package it.pkg.mapper.datasource0;

import it.pkg.model.datasource0.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: kayanochen
 * @Package: it.pkg.mapper.datasource0
 * @Description:
 * @Author: ylkj
 * @CreateDate: 16:15 2018/10/31
 * @Version: 1.0
 */
@Mapper
@Repository(value = "TestMapper0")
public interface TestMapper {
    List<Test> getAllTest();
}
