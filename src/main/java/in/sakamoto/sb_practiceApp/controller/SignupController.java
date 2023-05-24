package in.sakamoto.sb_practiceApp.controller;

import in.sakamoto.sb_practiceApp.application.service.UserApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/user")
public class SignupController {
    @Autowired
    private UserApplicationService userApplicationService;

    /* ユーザー登録画面の表示 */
    @GetMapping("/signup")
    public String getSignup(Model model) {
        // 性別を取得
        Map<String, Integer> genderMap = userApplicationService.getGenderMap();
        model.addAttribute("genderMap", genderMap);
        // ユーザー登録画面に遷移
        return "user/signup";
    }

    /* ユーザー登録処理 */
    @PostMapping("/signup")
    public String postSingup() {
        // ログイン画面にリダイレクト
        return "redirect:/login";
    }
}
