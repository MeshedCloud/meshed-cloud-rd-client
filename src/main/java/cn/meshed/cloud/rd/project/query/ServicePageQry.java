package cn.meshed.cloud.rd.project.query;

import cn.meshed.cloud.rd.project.enums.ReleaseStatusEnum;
import cn.meshed.cloud.rd.project.enums.ServiceAccessModeEnum;
import cn.meshed.cloud.rd.project.enums.ServiceTypeEnum;
import com.alibaba.cola.dto.PageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>服务分页查询参数</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "服务分页查询参数")
public class ServicePageQry extends PageQuery {

    /**
     * 项目唯一标识
     */
    @Schema(description = "项目唯一标识")
    private String projectKey;
    /**
     * 关键字
     */
    @Schema(description = "关键字")
    private String keyword;
    /**
     * 类型
     */
    @Schema(description = "类型")
    private ServiceTypeEnum type;
    /**
     * 服务分组所属领域key
     */
    @Schema(description = "服务分组所属领域key")
    private String domain;
    /**
     * 发行状态
     */
    @Schema(description = "发行状态")
    private ReleaseStatusEnum releaseStatus;
    /**
     * 授权模式
     */
    @Schema(description = "授权模式")
    private ServiceAccessModeEnum accessMode;
}
