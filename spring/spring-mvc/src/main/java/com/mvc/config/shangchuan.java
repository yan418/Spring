package com.mvc.config;


/**
 *  上传文件
 */
public class shangchuan {

//    @RequestMapping("/upload")
//    public String fileUpload(@RequestParam("file") CommonsMultipartFile file , HttpServletRequest request) throws IOException {
//
//        //获取文件名 : file.getOriginalFilename();
//        String uploadFileName = file.getOriginalFilename();
//
//        //如果文件名为空，直接回到首页！
//        if ("".equals(uploadFileName)){
//            return "redirect:/index.jsp";
//        }
//        System.out.println("上传文件名 : "+uploadFileName);
//
//        //上传路径保存设置
//        String path = request.getServletContext().getRealPath("/upload");
//        //如果路径不存在，创建一个
//        File realPath = new File(path);
//        if (!realPath.exists()){
//            realPath.mkdir();
//        }
//        System.out.println("上传文件保存地址："+realPath);
//
//        InputStream is = file.getInputStream(); //文件输入流
//        OutputStream os = new FileOutputStream(new File(realPath,uploadFileName)); //文件输出流
//
//        //读取写出
//        int len=0;
//        byte[] buffer = new byte[1024];
//        while ((len=is.read(buffer))!=-1){
//            os.write(buffer,0,len);
//            os.flush();
//        }
//        os.close();
//        is.close();
//        return "redirect:/index.jsp";
//    }

}
