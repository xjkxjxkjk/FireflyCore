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

public final class RestoreWolfBroGameArchiveCsReqOuterClass {
  /**
   * <pre>
   *  Mfmikggndbp
   * </pre>
   *
   * Protobuf type {@code RestoreWolfBroGameArchiveCsReq}
   */
  public static final class RestoreWolfBroGameArchiveCsReq extends ProtoMessage<RestoreWolfBroGameArchiveCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 id = 14;</code>
     */
    private int id;

    /**
     * <code>optional .MotionInfo motion = 1;</code>
     */
    private final MotionInfoOuterClass.MotionInfo motion = MotionInfoOuterClass.MotionInfo.newInstance();

    /**
     * <pre>
     *  ecglaijolji
     * </pre>
     *
     * <code>optional .GroupStateInfo group_state_info = 12;</code>
     */
    private final GroupStateInfoOuterClass.GroupStateInfo groupStateInfo = GroupStateInfoOuterClass.GroupStateInfo.newInstance();

    private RestoreWolfBroGameArchiveCsReq() {
    }

    /**
     * <pre>
     *  Mfmikggndbp
     * </pre>
     *
     * @return a new empty instance of {@code RestoreWolfBroGameArchiveCsReq}
     */
    public static RestoreWolfBroGameArchiveCsReq newInstance() {
      return new RestoreWolfBroGameArchiveCsReq();
    }

    /**
     * <code>optional uint32 id = 14;</code>
     * @return whether the id field is set
     */
    public boolean hasId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 id = 14;</code>
     * @return this
     */
    public RestoreWolfBroGameArchiveCsReq clearId() {
      bitField0_ &= ~0x00000001;
      id = 0;
      return this;
    }

    /**
     * <code>optional uint32 id = 14;</code>
     * @return the id
     */
    public int getId() {
      return id;
    }

    /**
     * <code>optional uint32 id = 14;</code>
     * @param value the id to set
     * @return this
     */
    public RestoreWolfBroGameArchiveCsReq setId(final int value) {
      bitField0_ |= 0x00000001;
      id = value;
      return this;
    }

    /**
     * <code>optional .MotionInfo motion = 1;</code>
     * @return whether the motion field is set
     */
    public boolean hasMotion() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .MotionInfo motion = 1;</code>
     * @return this
     */
    public RestoreWolfBroGameArchiveCsReq clearMotion() {
      bitField0_ &= ~0x00000002;
      motion.clear();
      return this;
    }

    /**
     * <code>optional .MotionInfo motion = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMotion()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public MotionInfoOuterClass.MotionInfo getMotion() {
      return motion;
    }

    /**
     * <code>optional .MotionInfo motion = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public MotionInfoOuterClass.MotionInfo getMutableMotion() {
      bitField0_ |= 0x00000002;
      return motion;
    }

    /**
     * <code>optional .MotionInfo motion = 1;</code>
     * @param value the motion to set
     * @return this
     */
    public RestoreWolfBroGameArchiveCsReq setMotion(final MotionInfoOuterClass.MotionInfo value) {
      bitField0_ |= 0x00000002;
      motion.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *  ecglaijolji
     * </pre>
     *
     * <code>optional .GroupStateInfo group_state_info = 12;</code>
     * @return whether the groupStateInfo field is set
     */
    public boolean hasGroupStateInfo() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     *  ecglaijolji
     * </pre>
     *
     * <code>optional .GroupStateInfo group_state_info = 12;</code>
     * @return this
     */
    public RestoreWolfBroGameArchiveCsReq clearGroupStateInfo() {
      bitField0_ &= ~0x00000004;
      groupStateInfo.clear();
      return this;
    }

    /**
     * <pre>
     *  ecglaijolji
     * </pre>
     *
     * <code>optional .GroupStateInfo group_state_info = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableGroupStateInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public GroupStateInfoOuterClass.GroupStateInfo getGroupStateInfo() {
      return groupStateInfo;
    }

    /**
     * <pre>
     *  ecglaijolji
     * </pre>
     *
     * <code>optional .GroupStateInfo group_state_info = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public GroupStateInfoOuterClass.GroupStateInfo getMutableGroupStateInfo() {
      bitField0_ |= 0x00000004;
      return groupStateInfo;
    }

    /**
     * <pre>
     *  ecglaijolji
     * </pre>
     *
     * <code>optional .GroupStateInfo group_state_info = 12;</code>
     * @param value the groupStateInfo to set
     * @return this
     */
    public RestoreWolfBroGameArchiveCsReq setGroupStateInfo(
        final GroupStateInfoOuterClass.GroupStateInfo value) {
      bitField0_ |= 0x00000004;
      groupStateInfo.copyFrom(value);
      return this;
    }

    @Override
    public RestoreWolfBroGameArchiveCsReq copyFrom(final RestoreWolfBroGameArchiveCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        id = other.id;
        motion.copyFrom(other.motion);
        groupStateInfo.copyFrom(other.groupStateInfo);
      }
      return this;
    }

    @Override
    public RestoreWolfBroGameArchiveCsReq mergeFrom(final RestoreWolfBroGameArchiveCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasId()) {
        setId(other.id);
      }
      if (other.hasMotion()) {
        getMutableMotion().mergeFrom(other.motion);
      }
      if (other.hasGroupStateInfo()) {
        getMutableGroupStateInfo().mergeFrom(other.groupStateInfo);
      }
      return this;
    }

    @Override
    public RestoreWolfBroGameArchiveCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      id = 0;
      motion.clear();
      groupStateInfo.clear();
      return this;
    }

    @Override
    public RestoreWolfBroGameArchiveCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      motion.clearQuick();
      groupStateInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RestoreWolfBroGameArchiveCsReq)) {
        return false;
      }
      RestoreWolfBroGameArchiveCsReq other = (RestoreWolfBroGameArchiveCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasId() || id == other.id)
        && (!hasMotion() || motion.equals(other.motion))
        && (!hasGroupStateInfo() || groupStateInfo.equals(other.groupStateInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(id);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 10);
        output.writeMessageNoTag(motion);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 98);
        output.writeMessageNoTag(groupStateInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(id);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(motion);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(groupStateInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RestoreWolfBroGameArchiveCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 112: {
            // id
            id = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // motion
            input.readMessage(motion);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // groupStateInfo
            input.readMessage(groupStateInfo);
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.id, id);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.motion, motion);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.groupStateInfo, groupStateInfo);
      }
      output.endObject();
    }

    @Override
    public RestoreWolfBroGameArchiveCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 3355: {
            if (input.isAtField(FieldNames.id)) {
              if (!input.trySkipNullValue()) {
                id = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1068318794: {
            if (input.isAtField(FieldNames.motion)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(motion);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1415312672:
          case 1198732636: {
            if (input.isAtField(FieldNames.groupStateInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(groupStateInfo);
                bitField0_ |= 0x00000004;
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
    public RestoreWolfBroGameArchiveCsReq clone() {
      return new RestoreWolfBroGameArchiveCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RestoreWolfBroGameArchiveCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RestoreWolfBroGameArchiveCsReq(), data).checkInitialized();
    }

    public static RestoreWolfBroGameArchiveCsReq parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new RestoreWolfBroGameArchiveCsReq(), input).checkInitialized();
    }

    public static RestoreWolfBroGameArchiveCsReq parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new RestoreWolfBroGameArchiveCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating RestoreWolfBroGameArchiveCsReq messages
     */
    public static MessageFactory<RestoreWolfBroGameArchiveCsReq> getFactory() {
      return RestoreWolfBroGameArchiveCsReqFactory.INSTANCE;
    }

    private enum RestoreWolfBroGameArchiveCsReqFactory implements MessageFactory<RestoreWolfBroGameArchiveCsReq> {
      INSTANCE;

      @Override
      public RestoreWolfBroGameArchiveCsReq create() {
        return RestoreWolfBroGameArchiveCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName id = FieldName.forField("id");

      static final FieldName motion = FieldName.forField("motion");

      static final FieldName groupStateInfo = FieldName.forField("groupStateInfo", "group_state_info");
    }
  }
}
