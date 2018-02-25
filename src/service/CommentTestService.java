package service;

import dao.CommentTestDaoImpl;
import javabean.Comment;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhouhang on 2017/11/29.
 */
@Transactional
public class CommentTestService {
    CommentTestDaoImpl commentTestDaoImpl;

    public void setCommentTestDaoImpl(CommentTestDaoImpl commentTestDaoImpl) {
        this.commentTestDaoImpl = commentTestDaoImpl;
    }
    public List<Comment> list() {

        return commentTestDaoImpl.list();
    }
    public void add(Comment comment) {
        commentTestDaoImpl.add(comment);
    }

    public void delete(Integer cid) {
        System.out.println(cid);
        commentTestDaoImpl.delete(cid);
    }

    public Comment findOne(Integer cid) {
        return commentTestDaoImpl.findOne(cid);
    }

    public void update(Comment comment) {
        commentTestDaoImpl.update(comment);
    }
}
