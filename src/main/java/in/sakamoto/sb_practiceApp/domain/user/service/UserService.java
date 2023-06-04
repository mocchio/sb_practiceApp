package in.sakamoto.sb_practiceApp.domain.user.service;

import in.sakamoto.sb_practiceApp.domain.user.model.MUser;

import java.util.List;

public interface UserService {

    /* ユーザー登録 */
    public void signup(MUser user);

    /* ユーザー取得 */
    public List<MUser> getUsers();
}
