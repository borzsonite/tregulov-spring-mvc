package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee") // ко всем методам контролера в @RequestMapping добавиться /employee
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {
        emp.setName("Mr. " + emp.getName());
        emp.setSurname(emp.getSurname() + "!");
        emp.setSalary(emp.getSalary() * 10);

        if(bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        } else {
            return "show-emp-details-view";
        }
    }

//    @RequestMapping("/askDetails")
//    public String askDetails () {
//        return "ask-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showDetails () {
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showDetails (HttpServletRequest request, Model model) { // получение данных из запроса добавление их в модель и передача во view
//        String empName = request.getParameter("employeeName"); // получили данные
//        empName = "Mr. " + empName;
//        model.addAttribute("empName", empName); // добавили в модель
//        model.addAttribute("descripiton", " nice to see you!");
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showDetails (@RequestParam("employeeName") String requestParam, Model model) { // получение данных путем  @RequestParam и добавление их в модель и передача во view
//        requestParam = "MR. " + requestParam;
//        model.addAttribute("empName", requestParam); // добавили в модель
//        model.addAttribute("descripiton", " Nice to see you!");
//        return "show-emp-details-view";
//    }


}
