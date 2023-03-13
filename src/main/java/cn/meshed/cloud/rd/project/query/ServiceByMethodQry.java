package cn.meshed.cloud.rd.project.query;

import cn.meshed.cloud.rd.project.enums.ModelTypeEnum;
import cn.meshed.cloud.rd.project.enums.ServiceTypeEnum;
import com.alibaba.cola.dto.Query;
import lombok.Data;

/**
 * <h1>方法查询参数</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class ServiceByMethodQry extends Query {
    /**
     * method
     */
    private String method;
    /**
     * 服务分组编码
     */
    private String groupId;

}
