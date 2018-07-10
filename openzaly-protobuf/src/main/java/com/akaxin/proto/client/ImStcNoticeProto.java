// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client/im_stc_notice.proto

package com.akaxin.proto.client;

public final class ImStcNoticeProto {
  private ImStcNoticeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code client.NoticeType}
   */
  public enum NoticeType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     *断开TCP链接，下线通知
     * </pre>
     *
     * <code>OFFLINE = 0;</code>
     */
    OFFLINE(0),
    /**
     * <pre>
     *新好友申请通知
     * </pre>
     *
     * <code>APPLY_FRIEND = 1;</code>
     */
    APPLY_FRIEND(1),
    /**
     * <pre>
     *新好友添加通知
     * </pre>
     *
     * <code>NEW_FRIEND = 2;</code>
     */
    NEW_FRIEND(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     *断开TCP链接，下线通知
     * </pre>
     *
     * <code>OFFLINE = 0;</code>
     */
    public static final int OFFLINE_VALUE = 0;
    /**
     * <pre>
     *新好友申请通知
     * </pre>
     *
     * <code>APPLY_FRIEND = 1;</code>
     */
    public static final int APPLY_FRIEND_VALUE = 1;
    /**
     * <pre>
     *新好友添加通知
     * </pre>
     *
     * <code>NEW_FRIEND = 2;</code>
     */
    public static final int NEW_FRIEND_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static NoticeType valueOf(int value) {
      return forNumber(value);
    }

    public static NoticeType forNumber(int value) {
      switch (value) {
        case 0: return OFFLINE;
        case 1: return APPLY_FRIEND;
        case 2: return NEW_FRIEND;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<NoticeType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        NoticeType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NoticeType>() {
            public NoticeType findValueByNumber(int number) {
              return NoticeType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.akaxin.proto.client.ImStcNoticeProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final NoticeType[] VALUES = values();

    public static NoticeType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private NoticeType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:client.NoticeType)
  }

  public interface ImStcNoticeRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:client.ImStcNoticeRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.client.NoticeType type = 1;</code>
     */
    int getTypeValue();
    /**
     * <code>.client.NoticeType type = 1;</code>
     */
    com.akaxin.proto.client.ImStcNoticeProto.NoticeType getType();
  }
  /**
   * Protobuf type {@code client.ImStcNoticeRequest}
   */
  public  static final class ImStcNoticeRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:client.ImStcNoticeRequest)
      ImStcNoticeRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ImStcNoticeRequest.newBuilder() to construct.
    private ImStcNoticeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ImStcNoticeRequest() {
      type_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ImStcNoticeRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akaxin.proto.client.ImStcNoticeProto.internal_static_client_ImStcNoticeRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akaxin.proto.client.ImStcNoticeProto.internal_static_client_ImStcNoticeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest.class, com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest.Builder.class);
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>.client.NoticeType type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.client.NoticeType type = 1;</code>
     */
    public com.akaxin.proto.client.ImStcNoticeProto.NoticeType getType() {
      com.akaxin.proto.client.ImStcNoticeProto.NoticeType result = com.akaxin.proto.client.ImStcNoticeProto.NoticeType.valueOf(type_);
      return result == null ? com.akaxin.proto.client.ImStcNoticeProto.NoticeType.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (type_ != com.akaxin.proto.client.ImStcNoticeProto.NoticeType.OFFLINE.getNumber()) {
        output.writeEnum(1, type_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != com.akaxin.proto.client.ImStcNoticeProto.NoticeType.OFFLINE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest)) {
        return super.equals(obj);
      }
      com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest other = (com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest) obj;

      boolean result = true;
      result = result && type_ == other.type_;
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code client.ImStcNoticeRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:client.ImStcNoticeRequest)
        com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akaxin.proto.client.ImStcNoticeProto.internal_static_client_ImStcNoticeRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akaxin.proto.client.ImStcNoticeProto.internal_static_client_ImStcNoticeRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest.class, com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest.Builder.class);
      }

      // Construct using com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        type_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akaxin.proto.client.ImStcNoticeProto.internal_static_client_ImStcNoticeRequest_descriptor;
      }

      public com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest getDefaultInstanceForType() {
        return com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest.getDefaultInstance();
      }

      public com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest build() {
        com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest buildPartial() {
        com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest result = new com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest(this);
        result.type_ = type_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest) {
          return mergeFrom((com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest other) {
        if (other == com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.client.NoticeType type = 1;</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.client.NoticeType type = 1;</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.client.NoticeType type = 1;</code>
       */
      public com.akaxin.proto.client.ImStcNoticeProto.NoticeType getType() {
        com.akaxin.proto.client.ImStcNoticeProto.NoticeType result = com.akaxin.proto.client.ImStcNoticeProto.NoticeType.valueOf(type_);
        return result == null ? com.akaxin.proto.client.ImStcNoticeProto.NoticeType.UNRECOGNIZED : result;
      }
      /**
       * <code>.client.NoticeType type = 1;</code>
       */
      public Builder setType(com.akaxin.proto.client.ImStcNoticeProto.NoticeType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.client.NoticeType type = 1;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:client.ImStcNoticeRequest)
    }

    // @@protoc_insertion_point(class_scope:client.ImStcNoticeRequest)
    private static final com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest();
    }

    public static com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ImStcNoticeRequest>
        PARSER = new com.google.protobuf.AbstractParser<ImStcNoticeRequest>() {
      public ImStcNoticeRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ImStcNoticeRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ImStcNoticeRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ImStcNoticeRequest> getParserForType() {
      return PARSER;
    }

    public com.akaxin.proto.client.ImStcNoticeProto.ImStcNoticeRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_client_ImStcNoticeRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_client_ImStcNoticeRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032client/im_stc_notice.proto\022\006client\032\017co" +
      "re/core.proto\"6\n\022ImStcNoticeRequest\022 \n\004t" +
      "ype\030\001 \001(\0162\022.client.NoticeType*;\n\nNoticeT" +
      "ype\022\013\n\007OFFLINE\020\000\022\020\n\014APPLY_FRIEND\020\001\022\016\n\nNE" +
      "W_FRIEND\020\0022N\n\022ImStcNoticeService\0228\n\006noti" +
      "ce\022\032.client.ImStcNoticeRequest\032\022.core.No" +
      "neResponseB+\n\027com.akaxin.proto.clientB\020I" +
      "mStcNoticeProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.akaxin.proto.core.CoreProto.getDescriptor(),
        }, assigner);
    internal_static_client_ImStcNoticeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_client_ImStcNoticeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_client_ImStcNoticeRequest_descriptor,
        new java.lang.String[] { "Type", });
    com.akaxin.proto.core.CoreProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
