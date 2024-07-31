// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class DeleteFriendCsReqOuterClass {
  /**
   * Protobuf type {@code DeleteFriendCsReq}
   */
  public static final class DeleteFriendCsReq extends ProtoMessage<DeleteFriendCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 IJDJCHIAJGP = 3;</code>
     */
    private int iJDJCHIAJGP;

    /**
     * <code>optional uint32 uid = 12;</code>
     */
    private int uid;

    private DeleteFriendCsReq() {
    }

    /**
     * @return a new empty instance of {@code DeleteFriendCsReq}
     */
    public static DeleteFriendCsReq newInstance() {
      return new DeleteFriendCsReq();
    }

    /**
     * <code>optional uint32 IJDJCHIAJGP = 3;</code>
     * @return whether the iJDJCHIAJGP field is set
     */
    public boolean hasIJDJCHIAJGP() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 IJDJCHIAJGP = 3;</code>
     * @return this
     */
    public DeleteFriendCsReq clearIJDJCHIAJGP() {
      bitField0_ &= ~0x00000001;
      iJDJCHIAJGP = 0;
      return this;
    }

    /**
     * <code>optional uint32 IJDJCHIAJGP = 3;</code>
     * @return the iJDJCHIAJGP
     */
    public int getIJDJCHIAJGP() {
      return iJDJCHIAJGP;
    }

    /**
     * <code>optional uint32 IJDJCHIAJGP = 3;</code>
     * @param value the iJDJCHIAJGP to set
     * @return this
     */
    public DeleteFriendCsReq setIJDJCHIAJGP(final int value) {
      bitField0_ |= 0x00000001;
      iJDJCHIAJGP = value;
      return this;
    }

    /**
     * <code>optional uint32 uid = 12;</code>
     * @return whether the uid field is set
     */
    public boolean hasUid() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 uid = 12;</code>
     * @return this
     */
    public DeleteFriendCsReq clearUid() {
      bitField0_ &= ~0x00000002;
      uid = 0;
      return this;
    }

    /**
     * <code>optional uint32 uid = 12;</code>
     * @return the uid
     */
    public int getUid() {
      return uid;
    }

    /**
     * <code>optional uint32 uid = 12;</code>
     * @param value the uid to set
     * @return this
     */
    public DeleteFriendCsReq setUid(final int value) {
      bitField0_ |= 0x00000002;
      uid = value;
      return this;
    }

    @Override
    public DeleteFriendCsReq copyFrom(final DeleteFriendCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        iJDJCHIAJGP = other.iJDJCHIAJGP;
        uid = other.uid;
      }
      return this;
    }

    @Override
    public DeleteFriendCsReq mergeFrom(final DeleteFriendCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasIJDJCHIAJGP()) {
        setIJDJCHIAJGP(other.iJDJCHIAJGP);
      }
      if (other.hasUid()) {
        setUid(other.uid);
      }
      return this;
    }

    @Override
    public DeleteFriendCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      iJDJCHIAJGP = 0;
      uid = 0;
      return this;
    }

    @Override
    public DeleteFriendCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof DeleteFriendCsReq)) {
        return false;
      }
      DeleteFriendCsReq other = (DeleteFriendCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasIJDJCHIAJGP() || iJDJCHIAJGP == other.iJDJCHIAJGP)
        && (!hasUid() || uid == other.uid);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(iJDJCHIAJGP);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(uid);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(iJDJCHIAJGP);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(uid);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public DeleteFriendCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // iJDJCHIAJGP
            iJDJCHIAJGP = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // uid
            uid = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.iJDJCHIAJGP, iJDJCHIAJGP);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.uid, uid);
      }
      output.endObject();
    }

    @Override
    public DeleteFriendCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -755503601: {
            if (input.isAtField(FieldNames.iJDJCHIAJGP)) {
              if (!input.trySkipNullValue()) {
                iJDJCHIAJGP = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 115792: {
            if (input.isAtField(FieldNames.uid)) {
              if (!input.trySkipNullValue()) {
                uid = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public DeleteFriendCsReq clone() {
      return new DeleteFriendCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static DeleteFriendCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new DeleteFriendCsReq(), data).checkInitialized();
    }

    public static DeleteFriendCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DeleteFriendCsReq(), input).checkInitialized();
    }

    public static DeleteFriendCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DeleteFriendCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating DeleteFriendCsReq messages
     */
    public static MessageFactory<DeleteFriendCsReq> getFactory() {
      return DeleteFriendCsReqFactory.INSTANCE;
    }

    private enum DeleteFriendCsReqFactory implements MessageFactory<DeleteFriendCsReq> {
      INSTANCE;

      @Override
      public DeleteFriendCsReq create() {
        return DeleteFriendCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName iJDJCHIAJGP = FieldName.forField("IJDJCHIAJGP");

      static final FieldName uid = FieldName.forField("uid");
    }
  }
}
