package model;

class CommonDocumentProperties // Klasse würde in eigenes .java File ausgelagert werden und könnte noch mehr Common Properties halten
{
	public int doc_id;
	public String user_id;
	public String title;
	public String doc_type;
	public String uploaded_date;
	public String extension;
}

public class Document {
	private int doc_id;
	private String user_id;
	private String title;
	private String doc_type;
	private String uploaded_date;
	private String extension;
	public Document(CommonDocumentProperties docProps) {
		this.doc_id = docProps.doc_id;
		this.user_id = docProps.user_id;
		this.title = docProps.title;
		this.doc_type = docProps.doc_type;
		this.uploaded_date = docProps.uploaded_date;
		this.extension= docProps.extension;
	}
	public Document() {
		doc_id=0;
		user_id="";
		title="";
		doc_type="";
		uploaded_date="";
		extension="";
	}
	public String toString() {
		return "Document [doc_id=" + doc_id + ", user_id=" + user_id + ", title=" + title + ", doc_type=" + doc_type
				+ ", published_date=" + uploaded_date + "]";
	}
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDoc_type() {
		return doc_type;
	}
	public void setDoc_type(String doc_type) {
		this.doc_type = doc_type;
	}
	public String getUploaded_date() {
		return uploaded_date;
	}
	public void setUploaded_date(String uploaded_date) {
		this.uploaded_date = uploaded_date;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
}
