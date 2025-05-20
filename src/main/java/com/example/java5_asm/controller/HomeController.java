package com.example.java5_asm.controller;

import com.example.java5_asm.constant.SessionAttr;
import com.example.java5_asm.dto.AccountDTO;
import com.example.java5_asm.dto.CategoryDTO;
import com.example.java5_asm.service.AccountService;
import com.example.java5_asm.service.CategoryService;
import com.example.java5_asm.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final HttpSession session;

    private final ProductService productService;
    private final AccountService accountService;
    private final CategoryService categoryService;

    @GetMapping("/home-page")
    public ModelAndView homePage() {
        ModelAndView model = new ModelAndView("home");
        model.addObject("products", productService.findProducts());
        return model;
    }

    @GetMapping("/menu")
    public ModelAndView menu() {

        ModelAndView model = new ModelAndView("user/menu");
        model.addObject("products", productService.findProducts());
        return model;

    }

    @GetMapping("/book")
    public ModelAndView book() {
        return new ModelAndView("user/book");
    }
//    @GetMapping("/login")
//    public ModelAndView login(){
//        ModelAndView model = new ModelAndView("user/login");
//        model.addObject("accounts", accountService.findAccounts());
//        return model;
//    }

    //làm thử mày mò mà ngu quá
    @GetMapping("/login")
    public ModelAndView loginGet() {
        return new ModelAndView("user/login");
    }

    @PostMapping("/login")
    public ModelAndView loginPost(@RequestParam("username") String username,
                                  @RequestParam("password") String password) {
        AccountDTO userByUsernameAndPassword = accountService.findUserByUsernameAndPassword(username, password);
        if (userByUsernameAndPassword != null) {
            session.setAttribute(SessionAttr.CURRENT_USER, userByUsernameAndPassword);
            return new ModelAndView("redirect:/home-page");
        } else {
            return new ModelAndView("/user/login");
        }
    }

    @GetMapping("/register")
    public ModelAndView registerPage() {
        return new ModelAndView("user/register");
    }

    @PostMapping("/register")
    public ModelAndView register(@ModelAttribute AccountDTO request) {
        AccountDTO accountDTO = accountService.registrationUser(request);
        if (accountDTO != null)
            return new ModelAndView("user/login");

        return new ModelAndView("user/register");
    }

    @GetMapping("/active-user")
    public ModelAndView activeUser(@RequestParam("id") String id) {
        AccountDTO accountDTO = accountService.activeUser(id);
        if (accountDTO != null)
            return new ModelAndView("user/login");

        return new ModelAndView("user/register");
    }

    @GetMapping("/sign-out")
    public ModelAndView signOut() {
        session.removeAttribute(SessionAttr.CURRENT_USER);
        return new ModelAndView("redirect:/home-page");
    }

    @GetMapping("/cast")
    public ModelAndView cast() {
        return new ModelAndView("user/cast");
    }

    @GetMapping("/about")
    public ModelAndView about() {
        return new ModelAndView("user/about");
    }

    @GetMapping("/category")
    public ModelAndView categoryPage() {
        ModelAndView model = new ModelAndView("admin/_category");
        model.addObject("category", categoryService.findCategories());
        return model;
    }

    @PostMapping("/category")
    public ModelAndView category(@ModelAttribute CategoryDTO request) {
        return new ModelAndView("admin/_category");
    }
}
