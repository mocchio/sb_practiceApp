package in.sakamoto.sb_practiceApp.controller;

import in.sakamoto.sb_practiceApp.application.service.UserApplicationService;
import in.sakamoto.sb_practiceApp.domain.user.model.MUser;
import in.sakamoto.sb_practiceApp.domain.user.service.UserService;
import in.sakamoto.sb_practiceApp.form.GroupOrder;
import in.sakamoto.sb_practiceApp.form.SignupForm;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping("/user")
@Slf4j
public class SignupController {
    @Autowired
    private UserApplicationService userApplicationService;

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    /* ユーザー登録画面の表示 */
    @GetMapping("/signup")
    public String getSignup(Model model, Locale locale, @ModelAttribute SignupForm form) {
        // 性別を取得
        Map<String, Integer> genderMap = userApplicationService.getGenderMap(locale);
        model.addAttribute("genderMap", genderMap);
        // ユーザー登録画面に遷移
        return "user/signup";
    }

    /* ユーザー登録処理 */
    @PostMapping("/signup")
    public String postSignup(Model model, Locale locale, @ModelAttribute @Validated(GroupOrder.class) SignupForm form, BindingResult bindingResult) {
        // 入力チェック結果
        if (bindingResult.hasErrors()) {
            // NG:入力画面に戻る
            return getSignup(model, locale, form);
        }
        log.info(form.toString());

        // formをMUserクラスに変換
        MUser user = modelMapper.map(form, MUser.class);

        // ユーザー登録
        userService.signup(user);

        // ログイン画面にリダイレクト
        return "redirect:/login";
    }
}
