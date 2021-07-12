package mari.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class CounterController {
	
	public int count;

    public int counter(HttpSession session){
        session.setAttribute("count", 0);
        int count = (Integer) session.getAttribute("count");
		return count;
    }
    
	@RequestMapping("/one")
	    public String index() {
    	count++;
        return "counter.jsp";
    }
	
	@RequestMapping("/two")
    public String counttwo() {
	count+= 2;
    return "countbytwo.jsp";
}
    
    @RequestMapping("/")
    public String time(Model model) {
    	model.addAttribute("count", count);
        return "index.jsp";
    }
    
    
}
