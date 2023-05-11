package cn.meshed.cloud.rd.project.command;

import cn.meshed.cloud.rd.project.data.EnumValueDTO;
import cn.meshed.cloud.rd.project.data.RequestFieldDTO;
import cn.meshed.cloud.rd.project.enums.ModelTypeEnum;
import cn.meshed.cloud.rd.project.enums.OperateEnum;
import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

/**
 * <h1>模型操作模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "模型操作模型")
public class ModelCmd extends Command {
    /**
     * uuid
     */
    @Schema(description = "模型唯一标识")
    private String uuid;
    /**
     * 模型中文解释
     */
    @Schema(description = "模型中文解释")
    @NotBlank(message = "模型中文解释不能为空")
    private String name;
    /**
     * 模型英文标识
     */
    @Schema(description = "模型英文标识")
    @NotBlank(message = "模型英文标识不能为空")
    private String key;
    /**
     * 模型父类
     */
    @Schema(description = "模型父类")
    private String superClass;
    /**
     * 领域
     */
    @Schema(description = "领域")
    @NotBlank(message = "领域不能为空")
    private String domain;
    /**
     * 模型所属项目唯一标识
     */
    @Schema(description = "模型所属项目唯一标识")
    @NotBlank(message = "模型所属项目唯一标识不能为空")
    private String projectKey;
    /**
     * 模型操作模式
     */
    @Schema(description = "模型操作模式")
    private OperateEnum operate;
    /**
     * 类型
     */
    @Schema(description = "类型")
    @NotNull(message = "类型不能为空")
    private ModelTypeEnum type;
    /**
     * 详情
     */
    @Schema(description = "详情")
    @NotBlank(message = "详情不能为空")
    private String description;

    /**
     * 模型字段
     */
    @Schema(description = "模型字段")
    private List<RequestFieldDTO> fields;

    /**
     * 相应枚举信息列表，仅在枚举类型
     */
    private List<EnumValueDTO> enumValues;

}
