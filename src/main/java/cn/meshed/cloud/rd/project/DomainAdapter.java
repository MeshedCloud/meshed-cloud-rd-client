package cn.meshed.cloud.rd.project;

import cn.meshed.cloud.rd.project.command.DomainCmd;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Set;

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
    SingleResponse<Set<String>> select(@Parameter(description = "项目唯一标识") @PathVariable("projectKey") String projectKey);

    /**
     * 领域新增
     *
     * @param domainCmd 项目唯一标识
     * @return {@link Response}
     */
    @Operation(summary = "领域新增")
    @PutMapping("/add")
    Response add(@Parameter(description = "新增参数") @Valid @RequestBody DomainCmd domainCmd);

    /**
     * 检查领域标识是否可用
     *
     * @param key 领域key
     * @return {@link Response}
     */
    @Operation(summary = "检查领域标识是否可用")
    @GetMapping("/available/key/{key}")
    Response availableKey(@Parameter(description = "领域唯一标识") @PathVariable("key") String key);


}
