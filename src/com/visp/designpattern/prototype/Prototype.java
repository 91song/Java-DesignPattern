package com.visp.designpattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Prototype implements Cloneable {
	private int id;
	private String name;
	private MyObject obj;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public MyObject getObj() {
		return obj;
	}

	public void setObj(MyObject obj) {
		this.obj = obj;
	}

	// 浅复制
	public Object clone() throws CloneNotSupportedException {
		Prototype prototype = (Prototype) super.clone();
		
		return prototype;
	}
	
	// 深复制
    public Object deepClone() throws IOException, ClassNotFoundException {  
        ByteArrayOutputStream bos = new ByteArrayOutputStream();  
        ObjectOutputStream oos = new ObjectOutputStream(bos);  
        oos.writeObject(this);  
  
        // 读出二进制流产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        
        return ois.readObject();  
    }
    
    class MyObject {
        private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
    }
}
