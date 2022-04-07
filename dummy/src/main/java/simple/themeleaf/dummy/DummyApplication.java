package simple.themeleaf.dummy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class DummyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DummyApplication.class, args);

    }

    @RequestMapping("/")
    public String showHome(){
        return "index";
    }
    @RequestMapping("404.html")
    public String a404(){ return "404"; }
    @RequestMapping("500.html")
    public String a500(){ return "500"; }
    @RequestMapping("blank.html")
    public String blank(){ return "blank"; }
    @RequestMapping("buttons.html")
    public String buttons(){ return "buttons"; }
    @RequestMapping("calendar.html")
    public String calendar(){ return "calendar"; }
    @RequestMapping("chat.html")
    public String chat(){ return "chat"; }
    @RequestMapping("coming-soon.html")
    public String comingsoon(){ return "coming-soon"; }
    @RequestMapping("contacts.html")
    public String contacts(){ return "contacts"; }
    @RequestMapping("dropzone.html")
    public String dropzone(){ return "dropzone"; }
    @RequestMapping("ecommerce.html")
    public String ecommerce(){ return "ecommerce"; }
    @RequestMapping("footer-dark.html")
    public String footer(){ return "footer-dark"; }
    @RequestMapping("footer-light.html")
    public String footerlight(){ return "footer-light"; }
    @RequestMapping("footer-transparent.html")
    public String footertransparent(){ return "footer-transparent"; }
    @RequestMapping("forgot-password.html")
    public String forgotpassword(){ return "forgot-password"; }
    @RequestMapping("form-elements.html")
    public String formelements(){ return "form-elements"; }
    @RequestMapping("form-wizard.html")
    public String formwizards(){ return "form-wizard"; }
    @RequestMapping("index.html")
    public String index(){ return "index"; }
    @RequestMapping("invoice.html")
    public String invoice(){ return "invoice"; }
    @RequestMapping("lock-screen.html")
    public String lockscreen(){ return "lock-screen"; }
    @RequestMapping("login.html")
    public String login(){ return "login"; }
    @RequestMapping("mailbox_compose.html")
    public String mailboxcompose(){ return "mailbox_compose"; }
    @RequestMapping("mailbox_inbox.html")
    public String mailboxinbox(){ return "mailbox_inbox"; }
    @RequestMapping("maintenance.html")
    public String maintenance(){ return "maintenance"; }
    @RequestMapping("modals.html")
    public String modals(){ return "modals"; }
    @RequestMapping("notes.html")
    public String notes(){ return "notes"; }
    @RequestMapping("order-view.html")
    public String orderview(){ return "order-view"; }
    @RequestMapping("orders.html")
    public String orders(){ return "orders"; }
    @RequestMapping("page-light.html")
    public String pagelight(){ return "page-light"; }
    @RequestMapping("pagination.html")
    public String pagination(){ return "pagination"; }
    @RequestMapping("pricing-tables.html")
    public String pricingtable(){ return "pricing-tables"; }
    @RequestMapping("products.html")
    public String products(){ return "products"; }
    @RequestMapping("products-edit.html")
    public String productsedit(){ return "products-edit"; }
    @RequestMapping("profile.html")
    public String profile(){ return "profile"; }
    @RequestMapping("progress-bars.html")
    public String progressbars(){ return "progress-bars"; }
    @RequestMapping("register.html")
    public String register(){ return "register"; }
    @RequestMapping("search-results.html")
    public String searchresults(){ return "search-results"; }
    @RequestMapping("sidebar-light.html")
    public String sidebarlight(){ return "sidebar-light"; }
    @RequestMapping("sweet-alerts.html")
    public String sweetalerts(){ return "sweet-alerts"; }
    @RequestMapping("tabs-accordions.html")
    public String tabsaccordions(){ return "tabs-accordions"; }
    @RequestMapping("timeline.html")
    public String timeline(){ return "timeline"; }
    @RequestMapping("todo-list.html")
    public String todolist(){ return "todo-list"; }
    @RequestMapping("ui-slider.html")
    public String uislider(){ return "ui-slider"; }
}
