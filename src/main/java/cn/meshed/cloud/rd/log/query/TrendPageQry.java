package cn.meshed.cloud.rd.log.query;

import com.alibaba.cola.dto.PageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>动态分页查询模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "动态分页查询模型")
public class TrendPageQry extends PageQuery {

    /**
     * 项目唯一标识
     */
    @Schema(description = "唯一类型")
    private String projectKey;

}
