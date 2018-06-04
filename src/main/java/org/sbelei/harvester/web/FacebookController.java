package org.sbelei.harvester.web;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FacebookController {

    private Facebook facebook;
    private ConnectionRepository connectionRepository;

    public FacebookController(ConnectionRepository connectionRepository) {
        this.connectionRepository = connectionRepository;
    }

    @GetMapping("facebook")
    public String helloFacebook(Model model) {
        if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
            return "redirect:/connect/facebook";
        }

        model.addAttribute("facebookProfile", facebook.userOperations().getUserProfile());
        PagedList<Post> feed = facebook.feedOperations().getFeed();
        model.addAttribute("feed", feed);
        return "hello";
    }
}
