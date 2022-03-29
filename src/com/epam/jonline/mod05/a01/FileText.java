package com.epam.jonline.mod05.a01;

public class FileText extends File{
	
	private String text;
	
	public FileText() {}
	
	public FileText(String name) {
		super(name);
		
	}
	
	public FileText (String name, String text) {
		super(name);
		this.text = text;
	
	}

	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public void addText(String s) {
		this.text += " " + s;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = result * prime + ((text == null) ? 0 : text.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FileText other = (FileText) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Text: " + text;
	}

}
