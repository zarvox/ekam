// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ekam/dashboard.proto

package com.googlecode.ekam.proto;

public final class DashboardProto {
  private DashboardProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class Header extends
      com.google.protobuf.GeneratedMessage {
    // Use Header.newBuilder() to construct.
    private Header() {
      initFields();
    }
    private Header(boolean noInit) {}
    
    private static final Header defaultInstance;
    public static Header getDefaultInstance() {
      return defaultInstance;
    }
    
    public Header getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.googlecode.ekam.proto.DashboardProto.internal_static_ekam_proto_Header_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.googlecode.ekam.proto.DashboardProto.internal_static_ekam_proto_Header_fieldAccessorTable;
    }
    
    // optional string project_root = 1;
    public static final int PROJECT_ROOT_FIELD_NUMBER = 1;
    private boolean hasProjectRoot;
    private java.lang.String projectRoot_ = "";
    public boolean hasProjectRoot() { return hasProjectRoot; }
    public java.lang.String getProjectRoot() { return projectRoot_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasProjectRoot()) {
        output.writeString(1, getProjectRoot());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasProjectRoot()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getProjectRoot());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.googlecode.ekam.proto.DashboardProto.Header parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.googlecode.ekam.proto.DashboardProto.Header parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.googlecode.ekam.proto.DashboardProto.Header parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.googlecode.ekam.proto.DashboardProto.Header parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.googlecode.ekam.proto.DashboardProto.Header parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.googlecode.ekam.proto.DashboardProto.Header parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.googlecode.ekam.proto.DashboardProto.Header parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.googlecode.ekam.proto.DashboardProto.Header parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.googlecode.ekam.proto.DashboardProto.Header parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.googlecode.ekam.proto.DashboardProto.Header parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.googlecode.ekam.proto.DashboardProto.Header prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.googlecode.ekam.proto.DashboardProto.Header result;
      
      // Construct using com.googlecode.ekam.proto.DashboardProto.Header.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.googlecode.ekam.proto.DashboardProto.Header();
        return builder;
      }
      
      protected com.googlecode.ekam.proto.DashboardProto.Header internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.googlecode.ekam.proto.DashboardProto.Header();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.googlecode.ekam.proto.DashboardProto.Header.getDescriptor();
      }
      
      public com.googlecode.ekam.proto.DashboardProto.Header getDefaultInstanceForType() {
        return com.googlecode.ekam.proto.DashboardProto.Header.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.googlecode.ekam.proto.DashboardProto.Header build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.googlecode.ekam.proto.DashboardProto.Header buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.googlecode.ekam.proto.DashboardProto.Header buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.googlecode.ekam.proto.DashboardProto.Header returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.googlecode.ekam.proto.DashboardProto.Header) {
          return mergeFrom((com.googlecode.ekam.proto.DashboardProto.Header)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.googlecode.ekam.proto.DashboardProto.Header other) {
        if (other == com.googlecode.ekam.proto.DashboardProto.Header.getDefaultInstance()) return this;
        if (other.hasProjectRoot()) {
          setProjectRoot(other.getProjectRoot());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setProjectRoot(input.readString());
              break;
            }
          }
        }
      }
      
      
      // optional string project_root = 1;
      public boolean hasProjectRoot() {
        return result.hasProjectRoot();
      }
      public java.lang.String getProjectRoot() {
        return result.getProjectRoot();
      }
      public Builder setProjectRoot(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasProjectRoot = true;
        result.projectRoot_ = value;
        return this;
      }
      public Builder clearProjectRoot() {
        result.hasProjectRoot = false;
        result.projectRoot_ = getDefaultInstance().getProjectRoot();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:ekam.proto.Header)
    }
    
    static {
      defaultInstance = new Header(true);
      com.googlecode.ekam.proto.DashboardProto.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:ekam.proto.Header)
  }
  
  public static final class TaskUpdate extends
      com.google.protobuf.GeneratedMessage {
    // Use TaskUpdate.newBuilder() to construct.
    private TaskUpdate() {
      initFields();
    }
    private TaskUpdate(boolean noInit) {}
    
    private static final TaskUpdate defaultInstance;
    public static TaskUpdate getDefaultInstance() {
      return defaultInstance;
    }
    
    public TaskUpdate getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.googlecode.ekam.proto.DashboardProto.internal_static_ekam_proto_TaskUpdate_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.googlecode.ekam.proto.DashboardProto.internal_static_ekam_proto_TaskUpdate_fieldAccessorTable;
    }
    
    public enum State
        implements com.google.protobuf.ProtocolMessageEnum {
      DELETED(0, 0),
      PENDING(1, 1),
      RUNNING(2, 2),
      DONE(3, 3),
      PASSED(4, 4),
      FAILED(5, 5),
      BLOCKED(6, 6),
      ;
      
      
      public final int getNumber() { return value; }
      
      public static State valueOf(int value) {
        switch (value) {
          case 0: return DELETED;
          case 1: return PENDING;
          case 2: return RUNNING;
          case 3: return DONE;
          case 4: return PASSED;
          case 5: return FAILED;
          case 6: return BLOCKED;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<State>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<State>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<State>() {
              public State findValueByNumber(int number) {
                return State.valueOf(number)
      ;        }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.googlecode.ekam.proto.DashboardProto.TaskUpdate.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final State[] VALUES = {
        DELETED, PENDING, RUNNING, DONE, PASSED, FAILED, BLOCKED, 
      };
      public static State valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      private final int index;
      private final int value;
      private State(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      static {
        com.googlecode.ekam.proto.DashboardProto.getDescriptor();
      }
      
      // @@protoc_insertion_point(enum_scope:ekam.proto.TaskUpdate.State)
    }
    
    // optional int32 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private boolean hasId;
    private int id_ = 0;
    public boolean hasId() { return hasId; }
    public int getId() { return id_; }
    
    // optional .ekam.proto.TaskUpdate.State state = 2;
    public static final int STATE_FIELD_NUMBER = 2;
    private boolean hasState;
    private com.googlecode.ekam.proto.DashboardProto.TaskUpdate.State state_;
    public boolean hasState() { return hasState; }
    public com.googlecode.ekam.proto.DashboardProto.TaskUpdate.State getState() { return state_; }
    
    // optional string verb = 3;
    public static final int VERB_FIELD_NUMBER = 3;
    private boolean hasVerb;
    private java.lang.String verb_ = "";
    public boolean hasVerb() { return hasVerb; }
    public java.lang.String getVerb() { return verb_; }
    
    // optional string noun = 4;
    public static final int NOUN_FIELD_NUMBER = 4;
    private boolean hasNoun;
    private java.lang.String noun_ = "";
    public boolean hasNoun() { return hasNoun; }
    public java.lang.String getNoun() { return noun_; }
    
    // optional bool silent = 5;
    public static final int SILENT_FIELD_NUMBER = 5;
    private boolean hasSilent;
    private boolean silent_ = false;
    public boolean hasSilent() { return hasSilent; }
    public boolean getSilent() { return silent_; }
    
    // optional string log = 6;
    public static final int LOG_FIELD_NUMBER = 6;
    private boolean hasLog;
    private java.lang.String log_ = "";
    public boolean hasLog() { return hasLog; }
    public java.lang.String getLog() { return log_; }
    
    private void initFields() {
      state_ = com.googlecode.ekam.proto.DashboardProto.TaskUpdate.State.DELETED;
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasId()) {
        output.writeInt32(1, getId());
      }
      if (hasState()) {
        output.writeEnum(2, getState().getNumber());
      }
      if (hasVerb()) {
        output.writeString(3, getVerb());
      }
      if (hasNoun()) {
        output.writeString(4, getNoun());
      }
      if (hasSilent()) {
        output.writeBool(5, getSilent());
      }
      if (hasLog()) {
        output.writeString(6, getLog());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getId());
      }
      if (hasState()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, getState().getNumber());
      }
      if (hasVerb()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getVerb());
      }
      if (hasNoun()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(4, getNoun());
      }
      if (hasSilent()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, getSilent());
      }
      if (hasLog()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(6, getLog());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.googlecode.ekam.proto.DashboardProto.TaskUpdate parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.googlecode.ekam.proto.DashboardProto.TaskUpdate parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.googlecode.ekam.proto.DashboardProto.TaskUpdate parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.googlecode.ekam.proto.DashboardProto.TaskUpdate parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.googlecode.ekam.proto.DashboardProto.TaskUpdate parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.googlecode.ekam.proto.DashboardProto.TaskUpdate parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.googlecode.ekam.proto.DashboardProto.TaskUpdate parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.googlecode.ekam.proto.DashboardProto.TaskUpdate parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.googlecode.ekam.proto.DashboardProto.TaskUpdate parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.googlecode.ekam.proto.DashboardProto.TaskUpdate parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.googlecode.ekam.proto.DashboardProto.TaskUpdate prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.googlecode.ekam.proto.DashboardProto.TaskUpdate result;
      
      // Construct using com.googlecode.ekam.proto.DashboardProto.TaskUpdate.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.googlecode.ekam.proto.DashboardProto.TaskUpdate();
        return builder;
      }
      
      protected com.googlecode.ekam.proto.DashboardProto.TaskUpdate internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.googlecode.ekam.proto.DashboardProto.TaskUpdate();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.googlecode.ekam.proto.DashboardProto.TaskUpdate.getDescriptor();
      }
      
      public com.googlecode.ekam.proto.DashboardProto.TaskUpdate getDefaultInstanceForType() {
        return com.googlecode.ekam.proto.DashboardProto.TaskUpdate.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.googlecode.ekam.proto.DashboardProto.TaskUpdate build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.googlecode.ekam.proto.DashboardProto.TaskUpdate buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.googlecode.ekam.proto.DashboardProto.TaskUpdate buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.googlecode.ekam.proto.DashboardProto.TaskUpdate returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.googlecode.ekam.proto.DashboardProto.TaskUpdate) {
          return mergeFrom((com.googlecode.ekam.proto.DashboardProto.TaskUpdate)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.googlecode.ekam.proto.DashboardProto.TaskUpdate other) {
        if (other == com.googlecode.ekam.proto.DashboardProto.TaskUpdate.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasState()) {
          setState(other.getState());
        }
        if (other.hasVerb()) {
          setVerb(other.getVerb());
        }
        if (other.hasNoun()) {
          setNoun(other.getNoun());
        }
        if (other.hasSilent()) {
          setSilent(other.getSilent());
        }
        if (other.hasLog()) {
          setLog(other.getLog());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setId(input.readInt32());
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              com.googlecode.ekam.proto.DashboardProto.TaskUpdate.State value = com.googlecode.ekam.proto.DashboardProto.TaskUpdate.State.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                setState(value);
              }
              break;
            }
            case 26: {
              setVerb(input.readString());
              break;
            }
            case 34: {
              setNoun(input.readString());
              break;
            }
            case 40: {
              setSilent(input.readBool());
              break;
            }
            case 50: {
              setLog(input.readString());
              break;
            }
          }
        }
      }
      
      
      // optional int32 id = 1;
      public boolean hasId() {
        return result.hasId();
      }
      public int getId() {
        return result.getId();
      }
      public Builder setId(int value) {
        result.hasId = true;
        result.id_ = value;
        return this;
      }
      public Builder clearId() {
        result.hasId = false;
        result.id_ = 0;
        return this;
      }
      
      // optional .ekam.proto.TaskUpdate.State state = 2;
      public boolean hasState() {
        return result.hasState();
      }
      public com.googlecode.ekam.proto.DashboardProto.TaskUpdate.State getState() {
        return result.getState();
      }
      public Builder setState(com.googlecode.ekam.proto.DashboardProto.TaskUpdate.State value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasState = true;
        result.state_ = value;
        return this;
      }
      public Builder clearState() {
        result.hasState = false;
        result.state_ = com.googlecode.ekam.proto.DashboardProto.TaskUpdate.State.DELETED;
        return this;
      }
      
      // optional string verb = 3;
      public boolean hasVerb() {
        return result.hasVerb();
      }
      public java.lang.String getVerb() {
        return result.getVerb();
      }
      public Builder setVerb(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasVerb = true;
        result.verb_ = value;
        return this;
      }
      public Builder clearVerb() {
        result.hasVerb = false;
        result.verb_ = getDefaultInstance().getVerb();
        return this;
      }
      
      // optional string noun = 4;
      public boolean hasNoun() {
        return result.hasNoun();
      }
      public java.lang.String getNoun() {
        return result.getNoun();
      }
      public Builder setNoun(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasNoun = true;
        result.noun_ = value;
        return this;
      }
      public Builder clearNoun() {
        result.hasNoun = false;
        result.noun_ = getDefaultInstance().getNoun();
        return this;
      }
      
      // optional bool silent = 5;
      public boolean hasSilent() {
        return result.hasSilent();
      }
      public boolean getSilent() {
        return result.getSilent();
      }
      public Builder setSilent(boolean value) {
        result.hasSilent = true;
        result.silent_ = value;
        return this;
      }
      public Builder clearSilent() {
        result.hasSilent = false;
        result.silent_ = false;
        return this;
      }
      
      // optional string log = 6;
      public boolean hasLog() {
        return result.hasLog();
      }
      public java.lang.String getLog() {
        return result.getLog();
      }
      public Builder setLog(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasLog = true;
        result.log_ = value;
        return this;
      }
      public Builder clearLog() {
        result.hasLog = false;
        result.log_ = getDefaultInstance().getLog();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:ekam.proto.TaskUpdate)
    }
    
    static {
      defaultInstance = new TaskUpdate(true);
      com.googlecode.ekam.proto.DashboardProto.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:ekam.proto.TaskUpdate)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ekam_proto_Header_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ekam_proto_Header_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ekam_proto_TaskUpdate_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ekam_proto_TaskUpdate_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ekam/dashboard.proto\022\nekam.proto\"\036\n\006He" +
      "ader\022\024\n\014project_root\030\001 \001(\t\"\335\001\n\nTaskUpdat" +
      "e\022\n\n\002id\030\001 \001(\005\022+\n\005state\030\002 \001(\0162\034.ekam.prot" +
      "o.TaskUpdate.State\022\014\n\004verb\030\003 \001(\t\022\014\n\004noun" +
      "\030\004 \001(\t\022\016\n\006silent\030\005 \001(\010\022\013\n\003log\030\006 \001(\t\"]\n\005S" +
      "tate\022\013\n\007DELETED\020\000\022\013\n\007PENDING\020\001\022\013\n\007RUNNIN" +
      "G\020\002\022\010\n\004DONE\020\003\022\n\n\006PASSED\020\004\022\n\n\006FAILED\020\005\022\013\n" +
      "\007BLOCKED\020\006B+\n\031com.googlecode.ekam.protoB" +
      "\016DashboardProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_ekam_proto_Header_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_ekam_proto_Header_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ekam_proto_Header_descriptor,
              new java.lang.String[] { "ProjectRoot", },
              com.googlecode.ekam.proto.DashboardProto.Header.class,
              com.googlecode.ekam.proto.DashboardProto.Header.Builder.class);
          internal_static_ekam_proto_TaskUpdate_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_ekam_proto_TaskUpdate_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ekam_proto_TaskUpdate_descriptor,
              new java.lang.String[] { "Id", "State", "Verb", "Noun", "Silent", "Log", },
              com.googlecode.ekam.proto.DashboardProto.TaskUpdate.class,
              com.googlecode.ekam.proto.DashboardProto.TaskUpdate.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}