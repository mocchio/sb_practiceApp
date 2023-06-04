package in.sakamoto.sb_practiceApp.domain.user.service.impl;

import in.sakamoto.sb_practiceApp.domain.user.model.MUser;
import in.sakamoto.sb_practiceApp.domain.user.service.UserService;
import in.sakamoto.sb_practiceApp.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    /* ユーザー登録 */
    @Override
    public void signup(MUser user) {
        user.setDepartmentId(1); // 部署
        user.setRole("ROLE_GENERAL"); // ロール
        mapper.insertOne(user);
    }

    /* ユーザー取得 */
    @Override
    public List<MUser> getUsers() {
        return mapper.findMany();
    }
}
