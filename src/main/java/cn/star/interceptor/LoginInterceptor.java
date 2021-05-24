//package cn.star.interceptor;
//
//import cn.star.domain.Users;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
///**
// * @Author Ninomiya_Mioto
// * Date on 2021/5/24  20:36
// */
//public class LoginInterceptor implements HandlerInterceptor {
//    @Override
//    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
//            throws Exception {
//        // 执行完毕，返回前拦截
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
//            throws Exception {
//        // 在处理过程中，执行拦截
//    }
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
////        // 在拦截点执行前拦截，如果返回true则不执行拦截点后的操作（拦截成功）
////        // 返回false则不执行拦截
////        HttpSession session = request.getSession();
////        //String uri = request.getRequestURI(); // 获取登录的uri，这个是不进行拦截的
////        //if(session.getAttribute("LOGIN_USER")!=null || uri.indexOf("system/login")!=-1) {// 说明登录成功 或者 执行登录功能
////        if(session.getAttribute("username")!=null) {
////            // 登录成功不拦截
////            return true;
////        }else {
////            // 拦截后进入登录页面
////            response.sendRedirect(request.getContextPath()+"/index");
////            return false;
////        }
////    }
//        String url=request.getRequestURI();
//        if(url.indexOf("/index")>=0){
//        return true;
//        }
//        HttpSession session=request.getSession();
//        if(session.getAttribute("username")!=null){
//            return true;
//        }
//        request.getRequestDispatcher(request.getContextPath()+"/index").forward(request,response);
//        return  false;
//    }
//}
