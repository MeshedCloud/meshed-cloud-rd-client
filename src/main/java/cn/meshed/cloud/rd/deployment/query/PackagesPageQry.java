package cn.meshed.cloud.rd.deployment.query;

import cn.meshed.cloud.rd.deployment.enums.PackagesTypeEnum;
import com.alibaba.cola.dto.PageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>制品分页查询模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "制品分页查询模型")
public class PackagesPageQry extends PageQuery {

    /**
     * 关键字
     */
    @Schema(description = "关键字")
    private String keyword;

    /**
     * 项目唯一标识
     */
    @Schema(description = "唯一类型")
    private String projectKey;

    /**
     * 制品类型
     */
    @Schema(description = "制品类型")
    private PackagesTypeEnum type;
}
