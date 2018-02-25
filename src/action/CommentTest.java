package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import javabean.Comment;
import org.apache.struts2.ServletActionContext;
import service.CommentTestService;

import java.util.List;

/**
 * Created by zhouhang on 2017/11/29.
 */
public class CommentTest extends ActionSupport implements ModelDriven<Comment> {
    private Comment comment = new Comment();
    private CommentTestService commentTestService;

    public void setCommentTestService(CommentTestService commentTestService) {
        this.commentTestService = commentTestService;
    }

    public String commentlist() {
        List<Comment> commentList = commentTestService.list();
        ServletActionContext.getRequest().setAttribute("commentList", commentList);
        return "commentlist";
    }
    public String tocommentaddpage() {
        return "tocommentaddpage";
    }
    public String commentadd() {
        commentTestService.add(comment);
        return "commentadd";
    }

    public String commentdelete() {
        commentTestService.delete((Integer) ServletActionContext.getRequest().getAttribute("cid"));
        return "commentdelete";

    }
    public String commentedit() {
        Comment thecomment=commentTestService.findOne(comment.getCid());
        ServletActionContext.getRequest().setAttribute("comment",thecomment);
        return "commentedit";
    }
    public String commentupdate()
    {
        commentTestService.update(comment);
        return "commentupdate";
    }
    @Override
    public Comment getModel() {
        return comment;
    }
}
