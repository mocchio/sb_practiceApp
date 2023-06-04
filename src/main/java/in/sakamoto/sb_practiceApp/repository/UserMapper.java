package in.sakamoto.sb_practiceApp.repository;

import in.sakamoto.sb_practiceApp.domain.user.model.MUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    /* ユーザー登録 */
    public int insertOne(MUser user);
}
