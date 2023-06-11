package in.sakamoto.sb_practiceApp.repository;

import in.sakamoto.sb_practiceApp.domain.user.model.MUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * ユーザー登録
     */
    int insertOne(MUser user);

    /**
     * ユーザー取得
     */
    List<MUser> findMany();

    /**
     * ユーザー取得（1件）
     */
    MUser findOne(String UserId);

    /**
     * ユーザー更新（1件）
     */
    void updateOne(@Param("userId") String userId,
                   @Param("password") String password,
                   @Param("userName") String userName);

    /**
     * ユーザー削除（1件）
     */
    int deleteOne(@Param("userId") String userId);
}
