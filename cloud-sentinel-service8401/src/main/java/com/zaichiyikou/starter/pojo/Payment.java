package com.zaichiyikou.starter.pojo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Component
public class Payment implements Serializable {
//    /**
//     * serialVersionUID
//     */
//    private static final long serialVersionUID = 1L;
    private Long id;
    private String serial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Payment(Long id, String serial) {
        super();
        this.id = id;
        this.serial = serial;
    }

    public Payment() {
        super();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((serial == null) ? 0 : serial.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Payment other = (Payment) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (serial == null) {
            if (other.serial != null)
                return false;
        } else if (!serial.equals(other.serial))
            return false;
        return true;
    }

}
