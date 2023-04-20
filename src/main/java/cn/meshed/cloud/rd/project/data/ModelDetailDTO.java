package cn.meshed.cloud.rd.project.data;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * <h1>模型传输模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "模型传输模型")
public class ModelDetailDTO extends ModelDTO {

    /**
     * 模型英文名
     */
    @Schema(description = "模型英文名")
    private String key;
    /**
     * 模型实体父类名称
     */
    @Schema(description = "模型实体父类名称")
    private String superClass;
    /**
     * 详情
     */
    @Schema(description = "详情")
    private String description;
    /**
     * 字段列表
     */
    @Schema(description = "字段列表")
    private List<RequestFieldDTO> fields;
    /**
     * 相应枚举信息列表
     */
    @Schema(description = "相应枚举信息列表")
    private List<EnumValueDTO> enumValues;
}
