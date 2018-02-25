package dao;

import javabean.Comment;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by zhouhang on 2017/11/29.
 */
public class CommentTestDaoImpl extends HibernateDaoSupport {

    public List<Comment> list(){
        HibernateTemplate hibernateTemplate=this.getHibernateTemplate();
        List<Comment> list= (List<Comment>) hibernateTemplate.find("from javabean.Comment");

        return list;
    }

    public void add(Comment comment) {
        HibernateTemplate hibernateTemplate=this.getHibernateTemplate();
        hibernateTemplate.save(comment);
    }

    public void delete(Integer cid) {
        HibernateTemplate hibernateTemplate=getHibernateTemplate();
        Comment comment = (Comment) hibernateTemplate.get(javabean.Comment.class, cid);
        hibernateTemplate.delete(comment);
    }

    public Comment findOne(Integer cid) {
        HibernateTemplate hibernateTemplate=getHibernateTemplate();
        return hibernateTemplate.get(Comment.class,cid);
    }

    public void update(Comment comment) {
        HibernateTemplate hibernateTemplate=getHibernateTemplate();
        hibernateTemplate.update(comment);
    }
}
