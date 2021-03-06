package sample.model;

import com.wordnik.swagger.annotations.ApiProperty;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created with IntelliJ IDEA.
 * User: kongchen
 * Date: 6/4/13
 */
public interface Entity<T> {
    @XmlElement(name = "id")
    @ApiProperty(notes = "Address' indentifier")
    Integer getId();

    void setId(Integer id);
}
