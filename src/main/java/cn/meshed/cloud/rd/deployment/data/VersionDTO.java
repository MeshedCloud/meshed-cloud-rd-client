package cn.meshed.cloud.rd.deployment.data;

import cn.meshed.cloud.rd.deployment.enums.EnvironmentEnum;
import cn.meshed.cloud.rd.deployment.enums.VersionStatusEnum;
import cn.meshed.cloud.rd.deployment.enums.VersionTypeEnum;
import com.alibaba.cola.dto.DTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * <h1>版本传输数据模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "版本传输数据模型")
public class VersionDTO extends DTO {
    /**
     * id
     */
    private Long id;
    /**
     * 版本仓库项目名称
     */
    private String name;
    /**
     * 版本实体项目全称代号
     */
    private String versionName;

    /**
     * 版本来源编码（仓库编码）
     */
    @Schema(description = "版本来源编码（仓库编码）")
    private String sourceId;

    /**
     * 环境
     */
    private List<EnvironmentEnum> environments;
    
    /**
     * 版本
     */
    private Long version;
    /**
     * 版本类型
     */
    private VersionTypeEnum type;
    /**
     * 版本状态
     */
    private VersionStatusEnum status;


}
