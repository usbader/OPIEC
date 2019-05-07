/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avroschema.linked;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class WikiArticleLinkedNLP extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WikiArticleLinkedNLP\",\"namespace\":\"avroschema.linked\",\"fields\":[{\"name\":\"title\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"url\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"text\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"links\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"WikiLink\",\"fields\":[{\"name\":\"offset_begin_ind\",\"type\":\"int\"},{\"name\":\"offset_end_ind\",\"type\":\"int\"},{\"name\":\"phrase\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"wiki_link\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}}]},{\"name\":\"sentences_linked\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"SentenceLinked\",\"fields\":[{\"name\":\"tokens\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TokenLinked\",\"fields\":[{\"name\":\"pos\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"ner\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"span\",\"type\":{\"type\":\"record\",\"name\":\"Span\",\"fields\":[{\"name\":\"start_index\",\"type\":[\"int\",\"null\"]},{\"name\":\"end_index\",\"type\":[\"int\",\"null\"]}]}},{\"name\":\"lemma\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"word\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"index\",\"type\":[\"int\",\"null\"]},{\"name\":\"w_link\",\"type\":\"WikiLink\"}]}}]},{\"name\":\"s_id\",\"type\":[\"int\",\"null\"]},{\"name\":\"sg\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"dp\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"span\",\"type\":[\"Span\",\"null\"]}]}}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String title;
  @Deprecated public java.lang.String id;
  @Deprecated public java.lang.String url;
  @Deprecated public java.lang.String text;
  @Deprecated public java.util.List<avroschema.linked.WikiLink> links;
  @Deprecated public java.util.List<avroschema.linked.SentenceLinked> sentences_linked;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public WikiArticleLinkedNLP() {}

  /**
   * All-args constructor.
   */
  public WikiArticleLinkedNLP(java.lang.String title, java.lang.String id, java.lang.String url, java.lang.String text, java.util.List<avroschema.linked.WikiLink> links, java.util.List<avroschema.linked.SentenceLinked> sentences_linked) {
    this.title = title;
    this.id = id;
    this.url = url;
    this.text = text;
    this.links = links;
    this.sentences_linked = sentences_linked;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return title;
    case 1: return id;
    case 2: return url;
    case 3: return text;
    case 4: return links;
    case 5: return sentences_linked;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: title = (java.lang.String)value$; break;
    case 1: id = (java.lang.String)value$; break;
    case 2: url = (java.lang.String)value$; break;
    case 3: text = (java.lang.String)value$; break;
    case 4: links = (java.util.List<avroschema.linked.WikiLink>)value$; break;
    case 5: sentences_linked = (java.util.List<avroschema.linked.SentenceLinked>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'title' field.
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Sets the value of the 'title' field.
   * @param value the value to set.
   */
  public void setTitle(java.lang.String value) {
    this.title = value;
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'url' field.
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * Sets the value of the 'url' field.
   * @param value the value to set.
   */
  public void setUrl(java.lang.String value) {
    this.url = value;
  }

  /**
   * Gets the value of the 'text' field.
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Sets the value of the 'text' field.
   * @param value the value to set.
   */
  public void setText(java.lang.String value) {
    this.text = value;
  }

  /**
   * Gets the value of the 'links' field.
   */
  public java.util.List<avroschema.linked.WikiLink> getLinks() {
    return links;
  }

  /**
   * Sets the value of the 'links' field.
   * @param value the value to set.
   */
  public void setLinks(java.util.List<avroschema.linked.WikiLink> value) {
    this.links = value;
  }

  /**
   * Gets the value of the 'sentences_linked' field.
   */
  public java.util.List<avroschema.linked.SentenceLinked> getSentencesLinked() {
    return sentences_linked;
  }

  /**
   * Sets the value of the 'sentences_linked' field.
   * @param value the value to set.
   */
  public void setSentencesLinked(java.util.List<avroschema.linked.SentenceLinked> value) {
    this.sentences_linked = value;
  }

  /** Creates a new WikiArticleLinkedNLP RecordBuilder */
  public static avroschema.linked.WikiArticleLinkedNLP.Builder newBuilder() {
    return new avroschema.linked.WikiArticleLinkedNLP.Builder();
  }
  
  /** Creates a new WikiArticleLinkedNLP RecordBuilder by copying an existing Builder */
  public static avroschema.linked.WikiArticleLinkedNLP.Builder newBuilder(avroschema.linked.WikiArticleLinkedNLP.Builder other) {
    return new avroschema.linked.WikiArticleLinkedNLP.Builder(other);
  }
  
  /** Creates a new WikiArticleLinkedNLP RecordBuilder by copying an existing WikiArticleLinkedNLP instance */
  public static avroschema.linked.WikiArticleLinkedNLP.Builder newBuilder(avroschema.linked.WikiArticleLinkedNLP other) {
    return new avroschema.linked.WikiArticleLinkedNLP.Builder(other);
  }
  
  /**
   * RecordBuilder for WikiArticleLinkedNLP instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<WikiArticleLinkedNLP>
    implements org.apache.avro.data.RecordBuilder<WikiArticleLinkedNLP> {

    private java.lang.String title;
    private java.lang.String id;
    private java.lang.String url;
    private java.lang.String text;
    private java.util.List<avroschema.linked.WikiLink> links;
    private java.util.List<avroschema.linked.SentenceLinked> sentences_linked;

    /** Creates a new Builder */
    private Builder() {
      super(avroschema.linked.WikiArticleLinkedNLP.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avroschema.linked.WikiArticleLinkedNLP.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.title)) {
        this.title = data().deepCopy(fields()[0].schema(), other.title);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.url)) {
        this.url = data().deepCopy(fields()[2].schema(), other.url);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.text)) {
        this.text = data().deepCopy(fields()[3].schema(), other.text);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.links)) {
        this.links = data().deepCopy(fields()[4].schema(), other.links);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.sentences_linked)) {
        this.sentences_linked = data().deepCopy(fields()[5].schema(), other.sentences_linked);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing WikiArticleLinkedNLP instance */
    private Builder(avroschema.linked.WikiArticleLinkedNLP other) {
            super(avroschema.linked.WikiArticleLinkedNLP.SCHEMA$);
      if (isValidValue(fields()[0], other.title)) {
        this.title = data().deepCopy(fields()[0].schema(), other.title);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.url)) {
        this.url = data().deepCopy(fields()[2].schema(), other.url);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.text)) {
        this.text = data().deepCopy(fields()[3].schema(), other.text);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.links)) {
        this.links = data().deepCopy(fields()[4].schema(), other.links);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.sentences_linked)) {
        this.sentences_linked = data().deepCopy(fields()[5].schema(), other.sentences_linked);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'title' field */
    public java.lang.String getTitle() {
      return title;
    }
    
    /** Sets the value of the 'title' field */
    public avroschema.linked.WikiArticleLinkedNLP.Builder setTitle(java.lang.String value) {
      validate(fields()[0], value);
      this.title = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'title' field has been set */
    public boolean hasTitle() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'title' field */
    public avroschema.linked.WikiArticleLinkedNLP.Builder clearTitle() {
      title = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'id' field */
    public java.lang.String getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public avroschema.linked.WikiArticleLinkedNLP.Builder setId(java.lang.String value) {
      validate(fields()[1], value);
      this.id = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'id' field */
    public avroschema.linked.WikiArticleLinkedNLP.Builder clearId() {
      id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'url' field */
    public java.lang.String getUrl() {
      return url;
    }
    
    /** Sets the value of the 'url' field */
    public avroschema.linked.WikiArticleLinkedNLP.Builder setUrl(java.lang.String value) {
      validate(fields()[2], value);
      this.url = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'url' field has been set */
    public boolean hasUrl() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'url' field */
    public avroschema.linked.WikiArticleLinkedNLP.Builder clearUrl() {
      url = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'text' field */
    public java.lang.String getText() {
      return text;
    }
    
    /** Sets the value of the 'text' field */
    public avroschema.linked.WikiArticleLinkedNLP.Builder setText(java.lang.String value) {
      validate(fields()[3], value);
      this.text = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'text' field has been set */
    public boolean hasText() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'text' field */
    public avroschema.linked.WikiArticleLinkedNLP.Builder clearText() {
      text = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'links' field */
    public java.util.List<avroschema.linked.WikiLink> getLinks() {
      return links;
    }
    
    /** Sets the value of the 'links' field */
    public avroschema.linked.WikiArticleLinkedNLP.Builder setLinks(java.util.List<avroschema.linked.WikiLink> value) {
      validate(fields()[4], value);
      this.links = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'links' field has been set */
    public boolean hasLinks() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'links' field */
    public avroschema.linked.WikiArticleLinkedNLP.Builder clearLinks() {
      links = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'sentences_linked' field */
    public java.util.List<avroschema.linked.SentenceLinked> getSentencesLinked() {
      return sentences_linked;
    }
    
    /** Sets the value of the 'sentences_linked' field */
    public avroschema.linked.WikiArticleLinkedNLP.Builder setSentencesLinked(java.util.List<avroschema.linked.SentenceLinked> value) {
      validate(fields()[5], value);
      this.sentences_linked = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'sentences_linked' field has been set */
    public boolean hasSentencesLinked() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'sentences_linked' field */
    public avroschema.linked.WikiArticleLinkedNLP.Builder clearSentencesLinked() {
      sentences_linked = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public WikiArticleLinkedNLP build() {
      try {
        WikiArticleLinkedNLP record = new WikiArticleLinkedNLP();
        record.title = fieldSetFlags()[0] ? this.title : (java.lang.String) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.String) defaultValue(fields()[1]);
        record.url = fieldSetFlags()[2] ? this.url : (java.lang.String) defaultValue(fields()[2]);
        record.text = fieldSetFlags()[3] ? this.text : (java.lang.String) defaultValue(fields()[3]);
        record.links = fieldSetFlags()[4] ? this.links : (java.util.List<avroschema.linked.WikiLink>) defaultValue(fields()[4]);
        record.sentences_linked = fieldSetFlags()[5] ? this.sentences_linked : (java.util.List<avroschema.linked.SentenceLinked>) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
