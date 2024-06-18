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

public final class ActivityStarFightOuterClass {
  /**
   * <pre>
   *  Nbchegjclei
   * </pre>
   *
   * Protobuf type {@code ActivityStarFight}
   */
  public static final class ActivityStarFight extends ProtoMessage<ActivityStarFight> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 group_id = 5;</code>
     */
    private int groupId;

    /**
     * <code>optional uint32 hnegangajhp = 10;</code>
     */
    private int hnegangajhp;

    /**
     * <code>optional uint32 libllkckfbd = 12;</code>
     */
    private int libllkckfbd;

    /**
     * <code>optional uint32 fjncdcbcpfd = 13;</code>
     */
    private int fjncdcbcpfd;

    /**
     * <code>optional bool lmdkgeicefn = 2;</code>
     */
    private boolean lmdkgeicefn;

    private ActivityStarFight() {
    }

    /**
     * <pre>
     *  Nbchegjclei
     * </pre>
     *
     * @return a new empty instance of {@code ActivityStarFight}
     */
    public static ActivityStarFight newInstance() {
      return new ActivityStarFight();
    }

    /**
     * <code>optional uint32 group_id = 5;</code>
     * @return whether the groupId field is set
     */
    public boolean hasGroupId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 group_id = 5;</code>
     * @return this
     */
    public ActivityStarFight clearGroupId() {
      bitField0_ &= ~0x00000001;
      groupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 5;</code>
     * @return the groupId
     */
    public int getGroupId() {
      return groupId;
    }

    /**
     * <code>optional uint32 group_id = 5;</code>
     * @param value the groupId to set
     * @return this
     */
    public ActivityStarFight setGroupId(final int value) {
      bitField0_ |= 0x00000001;
      groupId = value;
      return this;
    }

    /**
     * <code>optional uint32 hnegangajhp = 10;</code>
     * @return whether the hnegangajhp field is set
     */
    public boolean hasHnegangajhp() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 hnegangajhp = 10;</code>
     * @return this
     */
    public ActivityStarFight clearHnegangajhp() {
      bitField0_ &= ~0x00000002;
      hnegangajhp = 0;
      return this;
    }

    /**
     * <code>optional uint32 hnegangajhp = 10;</code>
     * @return the hnegangajhp
     */
    public int getHnegangajhp() {
      return hnegangajhp;
    }

    /**
     * <code>optional uint32 hnegangajhp = 10;</code>
     * @param value the hnegangajhp to set
     * @return this
     */
    public ActivityStarFight setHnegangajhp(final int value) {
      bitField0_ |= 0x00000002;
      hnegangajhp = value;
      return this;
    }

    /**
     * <code>optional uint32 libllkckfbd = 12;</code>
     * @return whether the libllkckfbd field is set
     */
    public boolean hasLibllkckfbd() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 libllkckfbd = 12;</code>
     * @return this
     */
    public ActivityStarFight clearLibllkckfbd() {
      bitField0_ &= ~0x00000004;
      libllkckfbd = 0;
      return this;
    }

    /**
     * <code>optional uint32 libllkckfbd = 12;</code>
     * @return the libllkckfbd
     */
    public int getLibllkckfbd() {
      return libllkckfbd;
    }

    /**
     * <code>optional uint32 libllkckfbd = 12;</code>
     * @param value the libllkckfbd to set
     * @return this
     */
    public ActivityStarFight setLibllkckfbd(final int value) {
      bitField0_ |= 0x00000004;
      libllkckfbd = value;
      return this;
    }

    /**
     * <code>optional uint32 fjncdcbcpfd = 13;</code>
     * @return whether the fjncdcbcpfd field is set
     */
    public boolean hasFjncdcbcpfd() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 fjncdcbcpfd = 13;</code>
     * @return this
     */
    public ActivityStarFight clearFjncdcbcpfd() {
      bitField0_ &= ~0x00000008;
      fjncdcbcpfd = 0;
      return this;
    }

    /**
     * <code>optional uint32 fjncdcbcpfd = 13;</code>
     * @return the fjncdcbcpfd
     */
    public int getFjncdcbcpfd() {
      return fjncdcbcpfd;
    }

    /**
     * <code>optional uint32 fjncdcbcpfd = 13;</code>
     * @param value the fjncdcbcpfd to set
     * @return this
     */
    public ActivityStarFight setFjncdcbcpfd(final int value) {
      bitField0_ |= 0x00000008;
      fjncdcbcpfd = value;
      return this;
    }

    /**
     * <code>optional bool lmdkgeicefn = 2;</code>
     * @return whether the lmdkgeicefn field is set
     */
    public boolean hasLmdkgeicefn() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional bool lmdkgeicefn = 2;</code>
     * @return this
     */
    public ActivityStarFight clearLmdkgeicefn() {
      bitField0_ &= ~0x00000010;
      lmdkgeicefn = false;
      return this;
    }

    /**
     * <code>optional bool lmdkgeicefn = 2;</code>
     * @return the lmdkgeicefn
     */
    public boolean getLmdkgeicefn() {
      return lmdkgeicefn;
    }

    /**
     * <code>optional bool lmdkgeicefn = 2;</code>
     * @param value the lmdkgeicefn to set
     * @return this
     */
    public ActivityStarFight setLmdkgeicefn(final boolean value) {
      bitField0_ |= 0x00000010;
      lmdkgeicefn = value;
      return this;
    }

    @Override
    public ActivityStarFight copyFrom(final ActivityStarFight other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        groupId = other.groupId;
        hnegangajhp = other.hnegangajhp;
        libllkckfbd = other.libllkckfbd;
        fjncdcbcpfd = other.fjncdcbcpfd;
        lmdkgeicefn = other.lmdkgeicefn;
      }
      return this;
    }

    @Override
    public ActivityStarFight mergeFrom(final ActivityStarFight other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasGroupId()) {
        setGroupId(other.groupId);
      }
      if (other.hasHnegangajhp()) {
        setHnegangajhp(other.hnegangajhp);
      }
      if (other.hasLibllkckfbd()) {
        setLibllkckfbd(other.libllkckfbd);
      }
      if (other.hasFjncdcbcpfd()) {
        setFjncdcbcpfd(other.fjncdcbcpfd);
      }
      if (other.hasLmdkgeicefn()) {
        setLmdkgeicefn(other.lmdkgeicefn);
      }
      return this;
    }

    @Override
    public ActivityStarFight clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      groupId = 0;
      hnegangajhp = 0;
      libllkckfbd = 0;
      fjncdcbcpfd = 0;
      lmdkgeicefn = false;
      return this;
    }

    @Override
    public ActivityStarFight clearQuick() {
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
      if (!(o instanceof ActivityStarFight)) {
        return false;
      }
      ActivityStarFight other = (ActivityStarFight) o;
      return bitField0_ == other.bitField0_
        && (!hasGroupId() || groupId == other.groupId)
        && (!hasHnegangajhp() || hnegangajhp == other.hnegangajhp)
        && (!hasLibllkckfbd() || libllkckfbd == other.libllkckfbd)
        && (!hasFjncdcbcpfd() || fjncdcbcpfd == other.fjncdcbcpfd)
        && (!hasLmdkgeicefn() || lmdkgeicefn == other.lmdkgeicefn);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(groupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(hnegangajhp);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(libllkckfbd);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(fjncdcbcpfd);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 16);
        output.writeBoolNoTag(lmdkgeicefn);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(hnegangajhp);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(libllkckfbd);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(fjncdcbcpfd);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ActivityStarFight mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // groupId
            groupId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // hnegangajhp
            hnegangajhp = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // libllkckfbd
            libllkckfbd = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // fjncdcbcpfd
            fjncdcbcpfd = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 16) {
              break;
            }
          }
          case 16: {
            // lmdkgeicefn
            lmdkgeicefn = input.readBool();
            bitField0_ |= 0x00000010;
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
        output.writeUInt32(FieldNames.groupId, groupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.hnegangajhp, hnegangajhp);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.libllkckfbd, libllkckfbd);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.fjncdcbcpfd, fjncdcbcpfd);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeBool(FieldNames.lmdkgeicefn, lmdkgeicefn);
      }
      output.endObject();
    }

    @Override
    public ActivityStarFight mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 293428218:
          case 506361563: {
            if (input.isAtField(FieldNames.groupId)) {
              if (!input.trySkipNullValue()) {
                groupId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1948597597: {
            if (input.isAtField(FieldNames.hnegangajhp)) {
              if (!input.trySkipNullValue()) {
                hnegangajhp = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1524036806: {
            if (input.isAtField(FieldNames.libllkckfbd)) {
              if (!input.trySkipNullValue()) {
                libllkckfbd = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1284065131: {
            if (input.isAtField(FieldNames.fjncdcbcpfd)) {
              if (!input.trySkipNullValue()) {
                fjncdcbcpfd = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 613100461: {
            if (input.isAtField(FieldNames.lmdkgeicefn)) {
              if (!input.trySkipNullValue()) {
                lmdkgeicefn = input.readBool();
                bitField0_ |= 0x00000010;
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
    public ActivityStarFight clone() {
      return new ActivityStarFight().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ActivityStarFight parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ActivityStarFight(), data).checkInitialized();
    }

    public static ActivityStarFight parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ActivityStarFight(), input).checkInitialized();
    }

    public static ActivityStarFight parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ActivityStarFight(), input).checkInitialized();
    }

    /**
     * @return factory for creating ActivityStarFight messages
     */
    public static MessageFactory<ActivityStarFight> getFactory() {
      return ActivityStarFightFactory.INSTANCE;
    }

    private enum ActivityStarFightFactory implements MessageFactory<ActivityStarFight> {
      INSTANCE;

      @Override
      public ActivityStarFight create() {
        return ActivityStarFight.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName groupId = FieldName.forField("groupId", "group_id");

      static final FieldName hnegangajhp = FieldName.forField("hnegangajhp");

      static final FieldName libllkckfbd = FieldName.forField("libllkckfbd");

      static final FieldName fjncdcbcpfd = FieldName.forField("fjncdcbcpfd");

      static final FieldName lmdkgeicefn = FieldName.forField("lmdkgeicefn");
    }
  }
}
