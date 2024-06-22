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

public final class AvatarSkillTreeOuterClass {
  /**
   * Protobuf type {@code AvatarSkillTree}
   */
  public static final class AvatarSkillTree extends ProtoMessage<AvatarSkillTree> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  NFEFAKDMAOC
     * </pre>
     *
     * <code>optional uint32 point_id = 1;</code>
     */
    private int pointId;

    /**
     * <pre>
     *  CFNKFJKAIAJ
     * </pre>
     *
     * <code>optional uint32 level = 2;</code>
     */
    private int level;

    private AvatarSkillTree() {
    }

    /**
     * @return a new empty instance of {@code AvatarSkillTree}
     */
    public static AvatarSkillTree newInstance() {
      return new AvatarSkillTree();
    }

    /**
     * <pre>
     *  NFEFAKDMAOC
     * </pre>
     *
     * <code>optional uint32 point_id = 1;</code>
     * @return whether the pointId field is set
     */
    public boolean hasPointId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  NFEFAKDMAOC
     * </pre>
     *
     * <code>optional uint32 point_id = 1;</code>
     * @return this
     */
    public AvatarSkillTree clearPointId() {
      bitField0_ &= ~0x00000001;
      pointId = 0;
      return this;
    }

    /**
     * <pre>
     *  NFEFAKDMAOC
     * </pre>
     *
     * <code>optional uint32 point_id = 1;</code>
     * @return the pointId
     */
    public int getPointId() {
      return pointId;
    }

    /**
     * <pre>
     *  NFEFAKDMAOC
     * </pre>
     *
     * <code>optional uint32 point_id = 1;</code>
     * @param value the pointId to set
     * @return this
     */
    public AvatarSkillTree setPointId(final int value) {
      bitField0_ |= 0x00000001;
      pointId = value;
      return this;
    }

    /**
     * <pre>
     *  CFNKFJKAIAJ
     * </pre>
     *
     * <code>optional uint32 level = 2;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *  CFNKFJKAIAJ
     * </pre>
     *
     * <code>optional uint32 level = 2;</code>
     * @return this
     */
    public AvatarSkillTree clearLevel() {
      bitField0_ &= ~0x00000002;
      level = 0;
      return this;
    }

    /**
     * <pre>
     *  CFNKFJKAIAJ
     * </pre>
     *
     * <code>optional uint32 level = 2;</code>
     * @return the level
     */
    public int getLevel() {
      return level;
    }

    /**
     * <pre>
     *  CFNKFJKAIAJ
     * </pre>
     *
     * <code>optional uint32 level = 2;</code>
     * @param value the level to set
     * @return this
     */
    public AvatarSkillTree setLevel(final int value) {
      bitField0_ |= 0x00000002;
      level = value;
      return this;
    }

    @Override
    public AvatarSkillTree copyFrom(final AvatarSkillTree other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        pointId = other.pointId;
        level = other.level;
      }
      return this;
    }

    @Override
    public AvatarSkillTree mergeFrom(final AvatarSkillTree other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasPointId()) {
        setPointId(other.pointId);
      }
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      return this;
    }

    @Override
    public AvatarSkillTree clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      pointId = 0;
      level = 0;
      return this;
    }

    @Override
    public AvatarSkillTree clearQuick() {
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
      if (!(o instanceof AvatarSkillTree)) {
        return false;
      }
      AvatarSkillTree other = (AvatarSkillTree) o;
      return bitField0_ == other.bitField0_
        && (!hasPointId() || pointId == other.pointId)
        && (!hasLevel() || level == other.level);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(pointId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(level);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(pointId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public AvatarSkillTree mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // pointId
            pointId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 16) {
              break;
            }
          }
          case 16: {
            // level
            level = input.readUInt32();
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
        output.writeUInt32(FieldNames.pointId, pointId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.level, level);
      }
      output.endObject();
    }

    @Override
    public AvatarSkillTree mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -400606517:
          case 466121258: {
            if (input.isAtField(FieldNames.pointId)) {
              if (!input.trySkipNullValue()) {
                pointId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 102865796: {
            if (input.isAtField(FieldNames.level)) {
              if (!input.trySkipNullValue()) {
                level = input.readUInt32();
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
    public AvatarSkillTree clone() {
      return new AvatarSkillTree().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static AvatarSkillTree parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new AvatarSkillTree(), data).checkInitialized();
    }

    public static AvatarSkillTree parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new AvatarSkillTree(), input).checkInitialized();
    }

    public static AvatarSkillTree parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new AvatarSkillTree(), input).checkInitialized();
    }

    /**
     * @return factory for creating AvatarSkillTree messages
     */
    public static MessageFactory<AvatarSkillTree> getFactory() {
      return AvatarSkillTreeFactory.INSTANCE;
    }

    private enum AvatarSkillTreeFactory implements MessageFactory<AvatarSkillTree> {
      INSTANCE;

      @Override
      public AvatarSkillTree create() {
        return AvatarSkillTree.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName pointId = FieldName.forField("pointId", "point_id");

      static final FieldName level = FieldName.forField("level");
    }
  }
}
