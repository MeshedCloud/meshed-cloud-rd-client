package cn.meshed.cloud.rd.project;

import cn.meshed.cloud.rd.project.command.ServiceGroupCmd;
import cn.meshed.cloud.rd.project.data.ServiceGroupDTO;
import cn.meshed.cloud.rd.project.data.ServiceGroupSelectDTO;
import cn.meshed.cloud.rd.project.query.ServiceAvailableClassQry;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Set;

/**
 * <h1>服务分组适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/service/group")
public interface ServiceGroupAdapter {

    /**
     * 服务分组选择获取
     *
     * @param projectKey 项目唯一标识
     * @return {@link SingleResponse< List <ServiceGroupDTO>>}
     */
    @Operation(summary = "服务分组选项")
    @GetMapping("/select/{projectKey}")
    SingleResponse<Set<ServiceGroupSelectDTO>> select(@Parameter(description = "项目唯一标识") @PathVariable("projectKey") String projectKey);

    /**
     * 服务分组查询信息
     *
     * @param uuid uuid
     * @return {@link SingleResponse< List <ServiceGroupDTO>>}
     */
    @Operation(summary = "服务分组查询信息")
    @GetMapping("/query/{uuid}")
    SingleResponse<ServiceGroupDTO> query(@Parameter(description = "项目唯一标识") @PathVariable("uuid") String uuid);

    /**
     * 保存功能
     *
     * @param serviceGroupCmd 服务分组数据
     * @return {@link Response}
     */
    @Operation(summary = "服务分组保存")
    @PostMapping("/save")
    Response save(@Parameter(description = "服务分组数据") @Valid @RequestBody ServiceGroupCmd serviceGroupCmd);

    /**
     * 检查类名是否可用（控制器中唯一性）
     *
     * @param serviceAvailableClassQry 检查参数
     * @return {@link Response}
     */
    @Operation(summary = "检查类名是否可用")
    @GetMapping("/available/class/name")
    Response availableClassName(@Parameter(description = "类名检查参数") @Valid ServiceAvailableClassQry serviceAvailableClassQry);

}
