package in.sakamoto.sb_practiceApp.domain.user.service;

import in.sakamoto.sb_practiceApp.domain.user.model.MUser;

import java.util.List;

public interface UserService {

    /**
     *  ユーザー登録
     */
    void signup(MUser user);

    /**
     *  ユーザー取得
     */
    List<MUser> getUsers();

    /**
     * ユーザー取得（1件）
     */
    MUser getUserOne(String userId);

    /**
     * ユーザー更新（1件）
     */
    void updateUserOne(String userId,
                       String password,
                       String userName);

    /**
     * ユーザー削除（1件）
     */
    void deleteUserOne(String userId);
}
