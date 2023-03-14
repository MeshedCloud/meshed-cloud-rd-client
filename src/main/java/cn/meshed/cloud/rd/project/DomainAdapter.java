package cn.meshed.cloud.rd.project;

import cn.meshed.cloud.rd.project.command.DomainCmd;
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

/**
 * <h1>领域适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/domain")
public interface DomainAdapter {

    /**
     * 领域选项
     *
     * @param projectKey 项目唯一标识
     * @return {@link SingleResponse<List<String>>}
     */
    @Operation(summary = "领域选项")
    @GetMapping("/select/{projectKey}")
    SingleResponse<List<String>> select(@Parameter(description = "项目唯一标识") @PathVariable("projectKey") String projectKey);

    /**
     * 领域新增
     *
     * @param domainCmd 项目唯一标识
     * @return {@link Response}
     */
    @Operation(summary = "领域新增")
    @PostMapping("/add")
    Response add(@Parameter(description = "新增参数") @Valid @RequestBody DomainCmd domainCmd);

}
