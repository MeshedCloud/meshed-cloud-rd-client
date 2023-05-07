package cn.meshed.cloud.rd.repo.query;

import cn.meshed.cloud.rd.repo.enums.RepositoryTreeTypeEnum;
import lombok.Data;

/**
 * <h1>查询代码库的文件树</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class RepositoryBlobQry {

    /**
     * 代码库ID
     */
    private String repositoryId;

    /**
     * 代码仓库内的文件路径，获取该路径下的文件目录，默认获取代码库文件树的全部结构
     */
    private String path;

    /**
     * 分支名称、标签名称或CommitID，默认为代码库库默认分支
     */
    private String refName;

}
