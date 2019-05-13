package com.example.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/{name}")
    public String welcome(@PathVariable String name, Model vmodel){
        vmodel.addAttribute("passingname",name);
        return "home";
    }

    @GetMapping("/")
    public String blank(){
        return "home";
    }

}

//
//package com.example.blog.controllers;
//
//        import com.example.blog.models.Post;
//        import com.example.blog.models.PostImage;
//        import com.example.blog.repositories.ImageRepository;
//        import com.example.blog.repositories.PostsRepository;
//        import com.example.blog.models.User;
//        import com.example.blog.repositories.UserRepository;
//        import org.springframework.stereotype.Controller;
//        import org.springframework.ui.Model;
//        import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class PostController {
//
//
//    private final PostsRepository postDao;
//    private final UserRepository userDao;
//    private final ImageRepository imageDao;
//
//    //constructor
//    public PostController(PostsRepository postDao,UserRepository userDao,ImageRepository imageDao){
//        this.postDao = postDao;
//        this.userDao = userDao;
//        this.imageDao = imageDao;
//    }
//
//
//
//    //    shows all the posts in the table
//    @GetMapping("/posts")
//    public String index(Model vmodel){
//        vmodel.addAttribute("post",postDao.findAll());
//        return "posts/index";
//    }
//
//
//
//    @GetMapping("/posts/{id}")
//    public String showpost(@PathVariable Long id, Model vmodel){
//        Post post = postDao.findOne(id);
//        vmodel.addAttribute("post",post);
//        return "posts/show";
//    }
//
//    //this url comes from browser then shows the create.html and from there,
////    there is a form that its method is post and action of URL:posts.
////    create so it sends the information here and saves it to the table
//    @GetMapping("/posts/create")
//    public String showcreateform(Model vmodel){
//        vmodel.addAttribute("post",new Post());
//        return "posts/create";
//    }
//
//    //information comes from create.html
//    @PostMapping("/posts/create")
////    @ResponseBody
//    public String createPost(@ModelAttribute Post post){
//        User user = userDao.findOne(1L);
//
////        PostImage newimage = new PostImage();
////        newimage.setPath(url);
////        imageDao.save(newimage);
//
////        Post newPost = new Post();
////        newPost.setBody(body);
////        newPost.setTitle(title);
////        postDao.save(newPost);
//
//        postDao.save(post);
//        return "redirect:/posts";
//    }
//
////    @GetMapping("/posts/{id}/image")
////    public String image(@PathVariable Long id ,Model vmoel){
////        Post post = postDao.findOne(id);
////        vmoel.addAttribute("post",post);
////        return "posts/addimages";
////    }
//
//    @GetMapping("/posts/{id}/edit")
//    public String editform(@PathVariable Long id ,Model vmoel){
//        Post post = postDao.findOne(id);
//        vmoel.addAttribute("post",post);
//        return "posts/edit";
//    }
//
//
//    @PostMapping("/posts/{id}/edit")
////    @ResponseBody
//    public String editpost(@RequestParam String title,@RequestParam String body,@PathVariable Long id){
//        Post post = postDao.findOne(id);
//        post.setBody(body);
//        post.setTitle(title);
//        postDao.save(post);
//        return "redirect:/posts";
//
//    }
//
//
//    @GetMapping("/posts/{id}/delete")
//    public String deleteform(@PathVariable Long id,Model vmodel){
//
//        Post post = postDao.findOne(id);
//        vmodel.addAttribute("post",post);
//        return ("posts/delete");
//    }
//
//    @PostMapping("/posts/{id}/delete")
////    @ResponseBody
//    public String deletePost(@PathVariable Long id){
//        postDao.delete(id);
//
//        return "redirect:/posts";
//    }
//
//
//
//
//
//
//
//
////
////    @GetMapping("/abc")
////    public String showposts(Model vmodel) {
////       // Post comes from Post.java
////        List<Post> post = new ArrayList<>();
////
////        post.add(new Post("a","b"));
////        post.add(new Post("c","d"));
////
////        vmodel.addAttribute("post",post);
////        return "posts/index";
////    }
//
//
//
//
//
//
//
//}
