package net.andrew.f1mod.client.model;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;


// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class F1Car extends EntityModel<Entity> {
	private ModelPart root;
	private final ModelPart Player;
	private final ModelPart FLWheel;
	private final ModelPart InnerRim;
	private final ModelPart OuterRim;
	private final ModelPart Tire;
	private final ModelPart FRWheel;
	private final ModelPart InnerRim2;
	private final ModelPart OuterRim2;
	private final ModelPart Tire2;
	private final ModelPart BLWheel;
	private final ModelPart InnerRim3;
	private final ModelPart OuterRim3;
	private final ModelPart Tire3;
	private final ModelPart BRWheel;
	private final ModelPart InnerRim4;
	private final ModelPart OuterRim4;
	private final ModelPart Tire4;
	private final ModelPart FrontWing;
	private final ModelPart NoseFrame;
	private final ModelPart Wing;
	private final ModelPart Wing2;
	private final ModelPart Wing3;
	private final ModelPart Wing4;
	private final ModelPart Edges;
	private final ModelPart ConnectToWheels;
	private final ModelPart Seat;
	private final ModelPart Headrest;
	private final ModelPart EngineSide;
	private final ModelPart Back;
	private final ModelPart Halo;
	private final ModelPart LeftSidepod;
	private final ModelPart RightSidepod;
	private final ModelPart ConnectToBack;
	private final ModelPart TopVent;
	private final ModelPart DRS;
	private final ModelPart DRSFlap;
	private final ModelPart SteeringWheel;
	private final ModelPart Mirrors;
	private final ModelPart Top;
	private final ModelPart bb_main;
	public F1Car() {
		this.Player = root.getChild("Player");
		this.FLWheel = root.getChild("FLWheel");
		this.InnerRim = root.getChild("InnerRim");
		this.OuterRim = root.getChild("OuterRim");
		this.Tire = root.getChild("Tire");
		this.FRWheel = root.getChild("FRWheel");
		this.InnerRim2 = root.getChild("InnerRim2");
		this.OuterRim2 = root.getChild("OuterRim2");
		this.Tire2 = root.getChild("Tire2");
		this.BLWheel = root.getChild("BLWheel");
		this.InnerRim3 = root.getChild("InnerRim3");
		this.OuterRim3 = root.getChild("OuterRim3");
		this.Tire3 = root.getChild("Tire3");
		this.BRWheel = root.getChild("BRWheel");
		this.InnerRim4 = root.getChild("InnerRim4");
		this.OuterRim4 = root.getChild("OuterRim4");
		this.Tire4 = root.getChild("Tire4");
		this.FrontWing = root.getChild("FrontWing");
		this.NoseFrame = root.getChild("NoseFrame");
		this.Wing = root.getChild("Wing");
		this.Wing2 = root.getChild("Wing2");
		this.Wing3 = root.getChild("Wing3");
		this.Wing4 = root.getChild("Wing4");
		this.Edges = root.getChild("Edges");
		this.ConnectToWheels = root.getChild("ConnectToWheels");
		this.Seat = root.getChild("Seat");
		this.Headrest = root.getChild("Headrest");
		this.EngineSide = root.getChild("EngineSide");
		this.Back = root.getChild("Back");
		this.Halo = root.getChild("Halo");
		this.LeftSidepod = root.getChild("LeftSidepod");
		this.RightSidepod = root.getChild("RightSidepod");
		this.ConnectToBack = root.getChild("ConnectToBack");
		this.TopVent = root.getChild("TopVent");
		this.DRS = root.getChild("DRS");
		this.DRSFlap = root.getChild("DRSFlap");
		this.SteeringWheel = root.getChild("SteeringWheel");
		this.Mirrors = root.getChild("Mirrors");
		this.Top = root.getChild("Top");
		this.bb_main = root.getChild("bb_main");
        this.root = root;
    }
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Player = modelPartData.addChild("Player", ModelPartBuilder.create().uv(-12, -6).cuboid(25.0F, -32.0F, -3.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(-4, -2).cuboid(29.0F, -12.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(-4, -2).cuboid(21.0F, -24.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(-4, -2).cuboid(33.0F, -24.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(-4, -2).cuboid(25.0F, -12.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(-8, -2).cuboid(25.0F, -24.0F, -1.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-29.0F, 23.0F, 0.0F));

		ModelPartData FLWheel = modelPartData.addChild("FLWheel", ModelPartBuilder.create(), ModelTransform.pivot(-18.0F, 16.0F, -24.0F));

		ModelPartData InnerRim = FLWheel.addChild("InnerRim", ModelPartBuilder.create().uv(198, 24).cuboid(-3.0F, -3.0F, 4.0F, 5.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(219, 258).cuboid(-3.0F, -4.0F, -3.0F, 5.0F, 7.0F, 7.0F, new Dilation(0.0F))
		.uv(254, 277).cuboid(-3.0F, -5.0F, -2.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(155, 277).cuboid(-3.0F, 3.0F, -2.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(198, 30).cuboid(-3.0F, -3.0F, -4.0F, 5.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, 0.0F));

		ModelPartData OuterRim = FLWheel.addChild("OuterRim", ModelPartBuilder.create().uv(261, 187).cuboid(-6.0F, -9.0F, -11.0F, 9.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(261, 40).cuboid(-6.0F, 1.0F, -11.0F, 9.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(42, 278).cuboid(-6.0F, -6.0F, -4.0F, 9.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(234, 277).cuboid(-6.0F, -6.0F, -14.0F, 9.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(209, 281).cuboid(-6.0F, -7.0F, -5.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(281, 199).cuboid(-6.0F, -8.0F, -6.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(281, 134).cuboid(-6.0F, -8.0F, -12.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(281, 132).cuboid(-6.0F, -7.0F, -13.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(281, 130).cuboid(-6.0F, -1.0F, -13.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(120, 281).cuboid(-6.0F, 0.0F, -12.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(281, 115).cuboid(-6.0F, 0.0F, -6.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(281, 113).cuboid(-6.0F, -1.0F, -5.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 3.0F, 9.0F));

		ModelPartData Tire = FLWheel.addChild("Tire", ModelPartBuilder.create().uv(50, 254).cuboid(-4.0F, -9.0F, -6.0F, 9.0F, 3.0F, 11.0F, new Dilation(0.0F))
		.uv(109, 252).cuboid(-4.0F, 5.0F, -6.0F, 9.0F, 3.0F, 11.0F, new Dilation(0.0F))
		.uv(195, 258).cuboid(-4.0F, -6.0F, 5.0F, 9.0F, 11.0F, 3.0F, new Dilation(0.0F))
		.uv(171, 258).cuboid(-4.0F, -6.0F, -9.0F, 9.0F, 11.0F, 3.0F, new Dilation(0.0F))
		.uv(212, 277).cuboid(-4.0F, -8.0F, -8.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(277, 168).cuboid(-4.0F, -8.0F, 5.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(138, 277).cuboid(-4.0F, 5.0F, 5.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(20, 277).cuboid(-4.0F, 5.0F, -8.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(190, 276).cuboid(-4.0F, 3.0F, -6.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(276, 46).cuboid(-4.0F, -6.0F, -6.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(275, 232).cuboid(-4.0F, -6.0F, 3.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(275, 154).cuboid(-4.0F, 3.0F, 3.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(281, 87).cuboid(-4.0F, 2.0F, 4.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(281, 85).cuboid(-4.0F, 4.0F, 2.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(62, 281).cuboid(-4.0F, 4.0F, -4.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(19, 281).cuboid(-4.0F, 2.0F, -6.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(280, 266).cuboid(-4.0F, -4.0F, -6.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(280, 237).cuboid(-4.0F, -6.0F, -4.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(190, 280).cuboid(-4.0F, -6.0F, 2.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(170, 280).cuboid(-4.0F, -4.0F, 4.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 1.0F));

		ModelPartData FRWheel = modelPartData.addChild("FRWheel", ModelPartBuilder.create(), ModelTransform.pivot(17.0F, 15.0F, -23.0F));

		ModelPartData InnerRim2 = FRWheel.addChild("InnerRim2", ModelPartBuilder.create().uv(193, 97).cuboid(-4.0F, -3.0F, 3.0F, 5.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(258, 140).cuboid(-4.0F, -4.0F, -4.0F, 5.0F, 7.0F, 7.0F, new Dilation(0.0F))
		.uv(275, 93).cuboid(-4.0F, -5.0F, -3.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 274).cuboid(-4.0F, 3.0F, -3.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(184, 75).cuboid(-4.0F, -3.0F, -5.0F, 5.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 1.0F, 0.0F));

		ModelPartData OuterRim2 = FRWheel.addChild("OuterRim2", ModelPartBuilder.create().uv(261, 34).cuboid(-6.0F, -9.0F, -11.0F, 9.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(259, 26).cuboid(-6.0F, 1.0F, -11.0F, 9.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(276, 176).cuboid(-6.0F, -6.0F, -4.0F, 9.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(275, 226).cuboid(-6.0F, -6.0F, -14.0F, 9.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(101, 280).cuboid(-6.0F, -7.0F, -5.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(81, 280).cuboid(-6.0F, -8.0F, -6.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 280).cuboid(-6.0F, -8.0F, -12.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(269, 279).cuboid(-6.0F, -7.0F, -13.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(279, 162).cuboid(-6.0F, -1.0F, -13.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(279, 160).cuboid(-6.0F, 0.0F, -12.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(279, 158).cuboid(-6.0F, 0.0F, -6.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(279, 117).cuboid(-6.0F, -1.0F, -5.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 4.0F, 8.0F));

		ModelPartData Tire2 = FRWheel.addChild("Tire2", ModelPartBuilder.create().uv(245, 244).cuboid(-6.0F, -12.0F, -13.0F, 9.0F, 3.0F, 11.0F, new Dilation(0.0F))
		.uv(245, 51).cuboid(-6.0F, 2.0F, -13.0F, 9.0F, 3.0F, 11.0F, new Dilation(0.0F))
		.uv(258, 117).cuboid(-6.0F, -9.0F, -2.0F, 9.0F, 11.0F, 3.0F, new Dilation(0.0F))
		.uv(26, 255).cuboid(-6.0F, -9.0F, -16.0F, 9.0F, 11.0F, 3.0F, new Dilation(0.0F))
		.uv(275, 141).cuboid(-6.0F, -11.0F, -15.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(275, 137).cuboid(-6.0F, -11.0F, -2.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(274, 249).cuboid(-6.0F, 2.0F, -2.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(274, 245).cuboid(-6.0F, 2.0F, -15.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(274, 241).cuboid(-6.0F, 0.0F, -13.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(274, 193).cuboid(-6.0F, -9.0F, -13.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(274, 89).cuboid(-6.0F, -9.0F, -4.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(274, 57).cuboid(-6.0F, 0.0F, -4.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(62, 279).cuboid(-6.0F, -1.0F, -3.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(279, 12).cuboid(-6.0F, 1.0F, -5.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(279, 10).cuboid(-6.0F, 1.0F, -11.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(170, 278).cuboid(-6.0F, -1.0F, -13.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(97, 278).cuboid(-6.0F, -7.0F, -13.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(277, 172).cuboid(-6.0F, -9.0F, -11.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(277, 99).cuboid(-6.0F, -9.0F, -5.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(276, 182).cuboid(-6.0F, -7.0F, -3.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 4.0F, 7.0F));

		ModelPartData BLWheel = modelPartData.addChild("BLWheel", ModelPartBuilder.create(), ModelTransform.pivot(-17.0F, 16.0F, 56.0F));

		ModelPartData InnerRim3 = BLWheel.addChild("InnerRim3", ModelPartBuilder.create().uv(123, 168).cuboid(-4.0F, -3.0F, 3.0F, 5.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(69, 235).cuboid(-4.0F, -4.0F, -4.0F, 5.0F, 7.0F, 7.0F, new Dilation(0.0F))
		.uv(270, 273).cuboid(-4.0F, -5.0F, -3.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(78, 273).cuboid(-4.0F, 3.0F, -3.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(33, 163).cuboid(-4.0F, -3.0F, -5.0F, 5.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, 1.0F));

		ModelPartData OuterRim3 = BLWheel.addChild("OuterRim3", ModelPartBuilder.create().uv(259, 20).cuboid(-6.0F, -9.0F, -11.0F, 9.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(259, 14).cuboid(-6.0F, 1.0F, -11.0F, 9.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(118, 274).cuboid(-6.0F, -6.0F, -4.0F, 9.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(274, 51).cuboid(-6.0F, -6.0F, -14.0F, 9.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(275, 145).cuboid(-6.0F, -7.0F, -5.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(274, 253).cuboid(-6.0F, -8.0F, -6.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(274, 197).cuboid(-6.0F, -8.0F, -12.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(274, 32).cuboid(-6.0F, -7.0F, -13.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(273, 69).cuboid(-6.0F, -1.0F, -13.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(270, 83).cuboid(-6.0F, 0.0F, -12.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(96, 268).cuboid(-6.0F, 0.0F, -6.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(70, 268).cuboid(-6.0F, -1.0F, -5.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 3.0F, 9.0F));

		ModelPartData Tire3 = BLWheel.addChild("Tire3", ModelPartBuilder.create().uv(205, 244).cuboid(-6.0F, -12.0F, -13.0F, 9.0F, 3.0F, 11.0F, new Dilation(0.0F))
		.uv(241, 103).cuboid(-6.0F, 2.0F, -13.0F, 9.0F, 3.0F, 11.0F, new Dilation(0.0F))
		.uv(102, 233).cuboid(-6.0F, -9.0F, -2.0F, 9.0F, 11.0F, 3.0F, new Dilation(0.0F))
		.uv(127, 216).cuboid(-6.0F, -9.0F, -16.0F, 9.0F, 11.0F, 3.0F, new Dilation(0.0F))
		.uv(253, 273).cuboid(-6.0F, -11.0F, -15.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(231, 273).cuboid(-6.0F, -11.0F, -2.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(151, 273).cuboid(-6.0F, 2.0F, -2.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(18, 273).cuboid(-6.0F, 2.0F, -15.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(272, 222).cuboid(-6.0F, 0.0F, -13.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(209, 272).cuboid(-6.0F, -9.0F, -13.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(272, 201).cuboid(-6.0F, -9.0F, -4.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(187, 272).cuboid(-6.0F, 0.0F, -4.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(268, 8).cuboid(-6.0F, -1.0F, -3.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(254, 222).cuboid(-6.0F, 1.0F, -5.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(158, 250).cuboid(-6.0F, 1.0F, -11.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(44, 250).cuboid(-6.0F, -1.0F, -13.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(69, 249).cuboid(-6.0F, -7.0F, -13.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(44, 248).cuboid(-6.0F, -9.0F, -11.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(239, 159).cuboid(-6.0F, -9.0F, -5.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 235).cuboid(-6.0F, -7.0F, -3.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 3.0F, 8.0F));

		ModelPartData BRWheel = modelPartData.addChild("BRWheel", ModelPartBuilder.create(), ModelTransform.pivot(18.0F, 16.0F, 56.0F));

		ModelPartData InnerRim4 = BRWheel.addChild("InnerRim4", ModelPartBuilder.create().uv(159, 124).cuboid(-4.0F, -3.0F, 3.0F, 5.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(19, 198).cuboid(-4.0F, -4.0F, -4.0F, 5.0F, 7.0F, 7.0F, new Dilation(0.0F))
		.uv(172, 272).cuboid(-4.0F, -5.0F, -3.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(98, 272).cuboid(-4.0F, 3.0F, -3.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(19, 150).cuboid(-4.0F, -3.0F, -5.0F, 5.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, 1.0F));

		ModelPartData OuterRim4 = BRWheel.addChild("OuterRim4", ModelPartBuilder.create().uv(258, 131).cuboid(-6.0F, -9.0F, -11.0F, 9.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(245, 65).cuboid(-6.0F, 1.0F, -11.0F, 9.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(63, 272).cuboid(-6.0F, -6.0F, -4.0F, 9.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(43, 272).cuboid(-6.0F, -6.0F, -14.0F, 9.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(231, 177).cuboid(-6.0F, -7.0F, -5.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(230, 36).cuboid(-6.0F, -8.0F, -6.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(230, 34).cuboid(-6.0F, -8.0F, -12.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(56, 214).cuboid(-6.0F, -7.0F, -13.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(210, 138).cuboid(-6.0F, -1.0F, -13.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(208, 17).cuboid(-6.0F, 0.0F, -12.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(198, 55).cuboid(-6.0F, 0.0F, -6.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 198).cuboid(-6.0F, -1.0F, -5.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 3.0F, 9.0F));

		ModelPartData Tire4 = BRWheel.addChild("Tire4", ModelPartBuilder.create().uv(241, 75).cuboid(-6.0F, -12.0F, -13.0F, 9.0F, 3.0F, 11.0F, new Dilation(0.0F))
		.uv(239, 0).cuboid(-6.0F, 2.0F, -13.0F, 9.0F, 3.0F, 11.0F, new Dilation(0.0F))
		.uv(166, 32).cuboid(-6.0F, -9.0F, -2.0F, 9.0F, 11.0F, 3.0F, new Dilation(0.0F))
		.uv(154, 95).cuboid(-6.0F, -9.0F, -16.0F, 9.0F, 11.0F, 3.0F, new Dilation(0.0F))
		.uv(271, 262).cuboid(-6.0F, -11.0F, -15.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(271, 258).cuboid(-6.0F, -11.0F, -2.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(131, 270).cuboid(-6.0F, 2.0F, -2.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(270, 109).cuboid(-6.0F, 2.0F, -15.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(270, 105).cuboid(-6.0F, 0.0F, -13.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(270, 101).cuboid(-6.0F, -9.0F, -13.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(270, 79).cuboid(-6.0F, -9.0F, -4.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(270, 75).cuboid(-6.0F, 0.0F, -4.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(193, 22).cuboid(-6.0F, -1.0F, -3.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(173, 22).cuboid(-6.0F, 1.0F, -5.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 170).cuboid(-6.0F, 1.0F, -11.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(53, 161).cuboid(-6.0F, -1.0F, -13.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 161).cuboid(-6.0F, -7.0F, -13.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(154, 91).cuboid(-6.0F, -9.0F, -11.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(146, 152).cuboid(-6.0F, -9.0F, -5.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 121).cuboid(-6.0F, -7.0F, -3.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 3.0F, 8.0F));

		ModelPartData FrontWing = modelPartData.addChild("FrontWing", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 13.0F, -26.0F));

		ModelPartData NoseFrame = FrontWing.addChild("NoseFrame", ModelPartBuilder.create().uv(50, 95).cuboid(-5.0F, -8.0F, 15.0F, 10.0F, 5.0F, 32.0F, new Dilation(0.0F))
		.uv(0, 104).cuboid(-5.0F, -9.0F, 19.0F, 10.0F, 1.0F, 28.0F, new Dilation(0.0F))
		.uv(129, 0).cuboid(-5.0F, -10.0F, 23.0F, 10.0F, 1.0F, 24.0F, new Dilation(0.0F))
		.uv(44, 172).cuboid(-5.0F, -11.0F, 27.0F, 10.0F, 1.0F, 20.0F, new Dilation(0.0F))
		.uv(97, 35).cuboid(-5.0F, -12.0F, 30.0F, 10.0F, 1.0F, 17.0F, new Dilation(0.0F))
		.uv(231, 163).cuboid(-5.0F, -13.0F, 34.0F, 10.0F, 1.0F, 13.0F, new Dilation(0.0F))
		.uv(138, 252).cuboid(-5.0F, -14.0F, 39.0F, 10.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(144, 180).cuboid(-5.0F, -6.0F, 7.0F, 10.0F, 3.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 163).cuboid(-5.0F, -7.0F, 10.0F, 10.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(181, 86).cuboid(-5.0F, -5.0F, 0.0F, 10.0F, 1.0F, 10.0F, new Dilation(0.0F))
		.uv(248, 177).cuboid(-5.0F, -4.0F, -1.0F, 10.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 127).cuboid(-5.0F, -2.0F, -2.0F, 10.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, -31.0F));

		ModelPartData Wing = FrontWing.addChild("Wing", ModelPartBuilder.create().uv(79, 47).cuboid(-7.0F, 5.0F, -41.0F, 14.0F, -2.0F, 6.0F, new Dilation(0.01F))
		.uv(123, 19).cuboid(-17.0F, 5.0F, -40.0F, 10.0F, -2.0F, 6.0F, new Dilation(0.0F))
		.uv(123, 15).cuboid(7.0F, 5.0F, -40.0F, 10.0F, -2.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(8.0F, 5.0F, -34.0F, 14.0F, -2.0F, 2.0F, new Dilation(0.0F))
		.uv(12, 58).cuboid(17.0F, 5.0F, -39.0F, 4.0F, -2.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 57).cuboid(-21.0F, 5.0F, -39.0F, 4.0F, -2.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-22.0F, 5.0F, -34.0F, 14.0F, -2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 10.0F));

		ModelPartData Wing2 = FrontWing.addChild("Wing2", ModelPartBuilder.create().uv(82, 53).cuboid(-7.0F, 5.0F, -41.0F, 14.0F, -1.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 122).cuboid(-17.0F, 5.0F, -40.0F, 10.0F, -1.0F, 6.0F, new Dilation(0.0F))
		.uv(96, 116).cuboid(7.0F, 5.0F, -40.0F, 10.0F, -1.0F, 6.0F, new Dilation(0.0F))
		.uv(28, 94).cuboid(8.0F, 5.0F, -34.0F, 14.0F, -1.0F, 2.0F, new Dilation(0.0F))
		.uv(12, 47).cuboid(17.0F, 5.0F, -39.0F, 4.0F, -1.0F, 5.0F, new Dilation(0.0F))
		.uv(29, 4).cuboid(-21.0F, 5.0F, -39.0F, 4.0F, -1.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 94).cuboid(-22.0F, 5.0F, -34.0F, 14.0F, -1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.0F, 12.0F));

		ModelPartData Wing3 = FrontWing.addChild("Wing3", ModelPartBuilder.create().uv(8, 9).cuboid(5.0F, 5.0F, -41.0F, 2.0F, -1.0F, 6.0F, new Dilation(0.0F))
		.uv(8, 4).cuboid(-7.0F, 5.0F, -41.0F, 2.0F, -1.0F, 6.0F, new Dilation(0.0F))
		.uv(55, 108).cuboid(-17.0F, 5.0F, -40.0F, 10.0F, -1.0F, 6.0F, new Dilation(0.0F))
		.uv(55, 103).cuboid(7.0F, 5.0F, -40.0F, 10.0F, -1.0F, 6.0F, new Dilation(0.0F))
		.uv(28, 93).cuboid(8.0F, 5.0F, -34.0F, 14.0F, -1.0F, 2.0F, new Dilation(0.0F))
		.uv(29, 0).cuboid(17.0F, 5.0F, -39.0F, 4.0F, -1.0F, 5.0F, new Dilation(0.0F))
		.uv(16, 4).cuboid(-21.0F, 5.0F, -39.0F, 4.0F, -1.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 93).cuboid(-22.0F, 5.0F, -34.0F, 14.0F, -1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.0F, 13.0F));

		ModelPartData Wing4 = FrontWing.addChild("Wing4", ModelPartBuilder.create().uv(34, 22).cuboid(-7.0F, 5.0F, -41.0F, 1.0F, -1.0F, 6.0F, new Dilation(0.0F))
		.uv(34, 17).cuboid(6.0F, 5.0F, -41.0F, 1.0F, -1.0F, 6.0F, new Dilation(0.0F))
		.uv(78, 18).cuboid(-17.0F, 5.0F, -40.0F, 10.0F, -1.0F, 6.0F, new Dilation(0.0F))
		.uv(78, 13).cuboid(7.0F, 5.0F, -40.0F, 10.0F, -1.0F, 6.0F, new Dilation(0.0F))
		.uv(83, 51).cuboid(8.0F, 5.0F, -34.0F, 14.0F, -1.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 0).cuboid(17.0F, 5.0F, -39.0F, 4.0F, -1.0F, 5.0F, new Dilation(0.0F))
		.uv(3, 0).cuboid(-21.0F, 5.0F, -39.0F, 4.0F, -1.0F, 5.0F, new Dilation(0.0F))
		.uv(69, 42).cuboid(-22.0F, 5.0F, -34.0F, 14.0F, -1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.0F, 14.0F));

		ModelPartData Edges = FrontWing.addChild("Edges", ModelPartBuilder.create().uv(146, 124).cuboid(3.0F, -11.0F, -4.0F, 2.0F, 8.0F, 9.0F, new Dilation(0.001F))
		.uv(0, 0).cuboid(3.0F, -10.0F, -4.0F, 2.0F, 7.0F, -3.0F, new Dilation(0.001F))
		.uv(0, 0).cuboid(3.0F, -8.0F, -7.0F, 2.0F, 5.0F, -3.0F, new Dilation(0.001F))
		.uv(0, 0).cuboid(3.0F, -12.0F, 5.0F, 2.0F, 1.0F, -8.0F, new Dilation(0.001F))
		.uv(21, 0).cuboid(45.0F, -11.0F, -4.0F, 2.0F, 8.0F, 9.0F, new Dilation(0.001F))
		.uv(0, 0).cuboid(45.0F, -10.0F, -4.0F, 2.0F, 7.0F, -3.0F, new Dilation(0.001F))
		.uv(0, 0).cuboid(45.0F, -8.0F, -7.0F, 2.0F, 5.0F, -3.0F, new Dilation(0.001F))
		.uv(0, 0).cuboid(45.0F, -12.0F, 5.0F, 2.0F, 1.0F, -8.0F, new Dilation(0.001F)), ModelTransform.pivot(-25.0F, 8.0F, -18.0F));

		ModelPartData ConnectToWheels = FrontWing.addChild("ConnectToWheels", ModelPartBuilder.create().uv(102, 95).cuboid(-12.7F, -16.0F, -30.0F, 1.0F, 10.0F, 11.0F, new Dilation(0.0F))
		.uv(260, 258).cuboid(-12.7F, -18.0F, -28.0F, 1.0F, 2.0F, 9.0F, new Dilation(0.0F))
		.uv(258, 227).cuboid(-16.7F, -19.2F, -27.0F, 4.0F, 1.0F, 9.0F, new Dilation(0.0F))
		.uv(96, 257).cuboid(-12.7F, -19.2F, -27.0F, 1.0F, 2.0F, 9.0F, new Dilation(-0.01F))
		.uv(117, 238).cuboid(11.6F, -19.2F, -27.0F, 1.0F, 2.0F, 9.0F, new Dilation(-0.01F))
		.uv(71, 13).cuboid(11.6F, -16.0F, -30.0F, 1.0F, 10.0F, 11.0F, new Dilation(0.0F))
		.uv(234, 244).cuboid(11.6F, -18.0F, -28.0F, 1.0F, 2.0F, 9.0F, new Dilation(0.0F))
		.uv(146, 141).cuboid(12.6F, -19.2F, -27.0F, 4.0F, 1.0F, 9.0F, new Dilation(0.0F))
		.uv(260, 269).cuboid(-15.0F, -15.0F, -22.0F, 10.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(20, 269).cuboid(5.0F, -15.0F, -22.0F, 10.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(268, 65).cuboid(5.0F, -11.0F, -27.0F, 10.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(268, 0).cuboid(5.0F, -11.0F, -24.0F, 10.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(48, 268).cuboid(-15.0F, -11.0F, -27.0F, 10.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(268, 4).cuboid(-15.0F, -11.0F, -24.0F, 10.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 11.0F, 26.0F));

		ModelPartData cube_r1 = ConnectToWheels.addChild("cube_r1", ModelPartBuilder.create().uv(0, 75).cuboid(-9.0F, -2.0F, -1.0F, 14.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(9.634F, -12.0F, -18.366F, -0.2139F, 0.6699F, -0.3365F));

		ModelPartData cube_r2 = ConnectToWheels.addChild("cube_r2", ModelPartBuilder.create().uv(48, 122).cuboid(-5.0F, -2.0F, -1.0F, 14.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-9.634F, -12.0F, -18.366F, -0.2139F, -0.6699F, 0.3365F));

		ModelPartData cube_r3 = ConnectToWheels.addChild("cube_r3", ModelPartBuilder.create().uv(35, 188).cuboid(-1.0F, -2.0F, -1.0F, 10.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-11.634F, -8.3F, -20.366F, 0.0F, -0.5236F, 0.0F));

		ModelPartData cube_r4 = ConnectToWheels.addChild("cube_r4", ModelPartBuilder.create().uv(260, 71).cuboid(-9.0F, -2.0F, -1.0F, 10.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(11.634F, -8.3F, -20.366F, 0.0F, 0.5236F, 0.0F));

		ModelPartData Seat = modelPartData.addChild("Seat", ModelPartBuilder.create().uv(96, 193).cuboid(5.0F, -19.0F, -10.0F, 2.0F, 11.0F, 1.0F, new Dilation(0.0F))
		.uv(134, 67).cuboid(-7.0F, -19.0F, -10.0F, 2.0F, 11.0F, 1.0F, new Dilation(0.0F))
		.uv(81, 212).cuboid(-5.0F, -18.0F, -10.0F, 10.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(154, 120).cuboid(-7.0F, -18.0F, -9.0F, 14.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 124).cuboid(-7.0F, -19.0F, -9.0F, 14.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(76, 50).cuboid(-7.0F, -19.0F, -7.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(76, 47).cuboid(6.0F, -19.0F, -7.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(78, 132).cuboid(7.0F, -19.0F, -9.0F, 1.0F, 11.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-8.0F, -19.0F, -9.0F, 1.0F, 11.0F, 6.0F, new Dilation(0.0F))
		.uv(62, 200).cuboid(-9.0F, -19.0F, -8.0F, 1.0F, 18.0F, 17.0F, new Dilation(0.0F))
		.uv(0, 200).cuboid(8.0F, -19.0F, -8.0F, 1.0F, 18.0F, 17.0F, new Dilation(0.0F))
		.uv(216, 75).cuboid(-8.0F, -8.0F, -9.0F, 16.0F, 7.0F, 2.0F, new Dilation(0.0F))
		.uv(183, 145).cuboid(-6.0F, -8.0F, -10.0F, 12.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 170).cuboid(-3.0F, -8.0F, -16.0F, 6.0F, 5.0F, 6.0F, new Dilation(0.0F))
		.uv(44, 237).cuboid(-2.0F, -8.0F, -22.0F, 4.0F, 5.0F, 6.0F, new Dilation(0.0F))
		.uv(206, 179).cuboid(-8.0F, -2.0F, -1.0F, 16.0F, 1.0F, 10.0F, new Dilation(0.0F))
		.uv(0, 34).cuboid(-8.0F, -1.0F, -7.0F, 16.0F, 0.0F, 6.0F, new Dilation(0.0F))
		.uv(124, 84).cuboid(-8.0F, -3.0F, 3.0F, 16.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(254, 206).cuboid(-8.0F, -17.0F, 7.0F, 16.0F, 14.0F, 2.0F, new Dilation(0.0F))
		.uv(33, 137).cuboid(-8.0F, -17.0F, 5.0F, 3.0F, 14.0F, 2.0F, new Dilation(0.0F))
		.uv(124, 67).cuboid(5.0F, -17.0F, 5.0F, 3.0F, 14.0F, 2.0F, new Dilation(0.0F))
		.uv(193, 242).cuboid(-5.0F, -12.0F, 6.0F, 10.0F, 9.0F, 1.0F, new Dilation(0.0F))
		.uv(115, 101).cuboid(-8.0F, -3.0F, 0.0F, 4.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(13, 110).cuboid(4.0F, -3.0F, 0.0F, 4.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData Headrest = modelPartData.addChild("Headrest", ModelPartBuilder.create().uv(206, 58).cuboid(-20.0F, -8.0F, 8.0F, 10.0F, 4.0F, 2.0F, new Dilation(0.0F))
		.uv(56, 193).cuboid(-24.0F, -8.0F, 10.0F, 18.0F, 4.0F, 2.0F, new Dilation(0.0F))
		.uv(102, 95).cuboid(-7.0F, -9.0F, 7.0F, 1.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(95, 23).cuboid(-24.0F, -9.0F, 7.0F, 1.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(48, 103).cuboid(-23.0F, -7.0F, 7.0F, 3.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 103).cuboid(-10.0F, -7.0F, 7.0F, 3.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(27, 58).cuboid(-11.0F, -4.0F, 7.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(14, 14).cuboid(-20.0F, -4.0F, 7.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 113).cuboid(-24.0F, -7.0F, 4.0F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(105, 35).cuboid(-7.0F, -7.0F, 4.0F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 109).cuboid(-7.0F, -5.0F, 1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(22, 58).cuboid(-24.0F, -5.0F, 1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(8, 48).cuboid(-23.0F, -9.0F, 8.0F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(25, 47).cuboid(-8.0F, -9.0F, 8.0F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-8.0F, -8.0F, 8.0F, -2.0F, 4.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-20.0F, -8.0F, 8.0F, -2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(15.0F, 9.0F, 1.0F));

		ModelPartData EngineSide = modelPartData.addChild("EngineSide", ModelPartBuilder.create().uv(0, 47).cuboid(-24.0F, 0.0F, 8.0F, 18.0F, 14.0F, 32.0F, new Dilation(0.0F))
		.uv(168, 180).cuboid(-22.0F, 0.0F, 40.0F, 13.0F, 14.0F, 12.0F, new Dilation(-0.01F))
		.uv(111, 156).cuboid(-27.0F, 13.0F, 48.0F, 24.0F, 1.0F, 7.0F, new Dilation(0.01F))
		.uv(234, 190).cuboid(-19.0F, 2.0F, 48.0F, 8.0F, 5.0F, 11.0F, new Dilation(0.0F))
		.uv(129, 0).cuboid(-18.0F, 4.0F, 48.0F, 6.0F, 9.0F, 6.0F, new Dilation(0.0F))
		.uv(78, 154).cuboid(-21.0F, 1.0F, 48.0F, 12.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(166, 55).cuboid(-21.0F, 0.0F, 48.0F, 12.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-22.0F, -4.0F, 8.0F, 14.0F, 4.0F, 43.0F, new Dilation(-0.1F))
		.uv(141, 233).cuboid(-18.0F, -2.0F, 50.0F, 6.0F, 3.0F, 14.0F, new Dilation(0.0F))
		.uv(0, 266).cuboid(-17.0F, 0.0F, 57.0F, 4.0F, 2.0F, 6.0F, new Dilation(0.0F))
		.uv(241, 89).cuboid(-22.0F, 0.0F, 55.0F, 14.0F, 3.0F, 5.0F, new Dilation(0.01F))
		.uv(0, 57).cuboid(-7.0F, -2.0F, 8.0F, -1.0F, 4.0F, 42.0F, new Dilation(0.0F))
		.uv(186, 152).cuboid(-9.0F, 2.0F, 40.0F, 1.0F, 2.0F, 10.0F, new Dilation(0.0F))
		.uv(181, 97).cuboid(-22.0F, 2.0F, 40.0F, 1.0F, 2.0F, 10.0F, new Dilation(0.0F))
		.uv(0, 53).cuboid(-22.0F, -2.0F, 8.0F, -1.0F, 4.0F, 42.0F, new Dilation(0.0F))
		.uv(0, 50).cuboid(-22.0F, -3.0F, 8.0F, -3.0F, 3.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 38).cuboid(-20.0F, -5.0F, 13.0F, -4.0F, 3.0F, 9.0F, new Dilation(0.0F))
		.uv(0, 24).cuboid(-5.0F, -3.0F, 8.0F, -3.0F, 3.0F, 16.0F, new Dilation(0.0F))
		.uv(26, 31).cuboid(-6.0F, -5.0F, 13.0F, -4.0F, 3.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(15.0F, 9.0F, 1.0F));

		ModelPartData Back = modelPartData.addChild("Back", ModelPartBuilder.create().uv(124, 67).cuboid(-26.0F, 8.0F, -13.0F, 22.0F, 1.0F, 16.0F, new Dilation(0.01F))
		.uv(68, 47).cuboid(-26.0F, 9.0F, -12.0F, 1.0F, 4.0F, 15.0F, new Dilation(0.01F))
		.uv(0, 47).cuboid(-5.0F, 9.0F, -12.0F, 1.0F, 4.0F, 15.0F, new Dilation(0.01F))
		.uv(48, 103).cuboid(-3.4F, 3.0F, -12.0F, 1.0F, 8.0F, 11.0F, new Dilation(0.01F))
		.uv(0, 103).cuboid(-27.6F, 3.0F, -12.0F, 1.0F, 8.0F, 11.0F, new Dilation(0.01F))
		.uv(33, 137).cuboid(-16.5F, 6.0F, -12.0F, 3.0F, 4.0F, 17.0F, new Dilation(0.01F))
		.uv(120, 233).cuboid(-16.0F, 3.0F, -12.0F, 2.0F, 2.0F, 17.0F, new Dilation(0.01F))
		.uv(23, 237).cuboid(-16.0F, 2.5F, -13.0F, 2.0F, 1.0F, 17.0F, new Dilation(0.0F))
		.uv(239, 140).cuboid(-16.5F, 3.0F, -13.0F, 1.0F, 2.0F, 17.0F, new Dilation(0.01F))
		.uv(239, 121).cuboid(-14.5F, 3.0F, -13.0F, 1.0F, 2.0F, 17.0F, new Dilation(0.01F))
		.uv(48, 236).cuboid(-16.0F, 4.5F, -13.0F, 2.0F, 1.0F, 17.0F, new Dilation(0.0F)), ModelTransform.pivot(15.0F, 9.0F, 64.0F));

		ModelPartData Halo = modelPartData.addChild("Halo", ModelPartBuilder.create().uv(0, 57).cuboid(-0.5F, -21.0F, -10.0F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(68, 47).cuboid(-0.5F, -23.0F, -9.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(17, 51).cuboid(-0.5F, -24.0F, -8.0F, 1.0F, 2.0F, 2.0F, new Dilation(-0.01F))
		.uv(166, 46).cuboid(-4.5F, -25.0F, -7.0F, 9.0F, 1.0F, 2.0F, new Dilation(-0.01F))
		.uv(0, 0).cuboid(6.5F, -24.7F, -5.0F, -4.0F, 1.0F, 1.0F, new Dilation(-0.01F))
		.uv(0, 0).cuboid(7.5F, -24.4F, -4.0F, -3.0F, 1.0F, 1.0F, new Dilation(-0.01F))
		.uv(0, 0).cuboid(-4.5F, -24.4F, -4.0F, -3.0F, 1.0F, 1.0F, new Dilation(-0.01F))
		.uv(8, 1).cuboid(-7.5F, -24.3F, -3.0F, -1.0F, 1.0F, 4.0F, new Dilation(-0.01F))
		.uv(34, 3).cuboid(-8.3F, -24.1F, -1.0F, -1.0F, 1.0F, 5.0F, new Dilation(-0.01F))
		.uv(0, 1).cuboid(-9.0F, -24.0F, 0.0F, -1.0F, 1.0F, 4.0F, new Dilation(-0.01F))
		.uv(0, 0).cuboid(10.0F, -24.0F, 0.0F, -1.0F, 1.0F, 4.0F, new Dilation(-0.01F))
		.uv(21, 3).cuboid(9.5F, -24.1F, -1.0F, -1.0F, 1.0F, 5.0F, new Dilation(-0.01F))
		.uv(8, 0).cuboid(8.5F, -24.3F, -3.0F, -1.0F, 1.0F, 4.0F, new Dilation(-0.01F))
		.uv(0, 0).cuboid(-6.5F, -24.3F, -3.0F, -1.0F, 1.0F, 1.0F, new Dilation(-0.01F))
		.uv(0, 0).cuboid(7.5F, -24.3F, -3.0F, -1.0F, 1.0F, 1.0F, new Dilation(-0.01F))
		.uv(0, 0).cuboid(-2.5F, -24.7F, -5.0F, -4.0F, 1.0F, 1.0F, new Dilation(-0.01F))
		.uv(0, 190).cuboid(-3.5F, -24.5F, -8.0F, 7.0F, 1.0F, 2.0F, new Dilation(0.01F))
		.uv(35, 193).cuboid(-2.5F, -24.25F, -8.25F, 5.0F, 1.0F, 2.0F, new Dilation(0.01F))
		.uv(89, 73).cuboid(-1.5F, -24.0F, -8.75F, 3.0F, 1.0F, 2.0F, new Dilation(0.01F))
		.uv(71, 38).cuboid(-0.1F, -23.5F, -8.75F, 1.0F, 1.0F, 2.0F, new Dilation(-0.01F))
		.uv(71, 35).cuboid(-1.1F, -23.5F, -8.75F, 1.0F, 1.0F, 2.0F, new Dilation(-0.01F))
		.uv(56, 133).cuboid(9.0F, -24.0F, 4.0F, 1.0F, 5.0F, 9.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(6.0F, -23.0F, 17.0F, 4.0F, 4.0F, -4.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-10.0F, -23.0F, 17.0F, 4.0F, 4.0F, -4.0F, new Dilation(0.0F))
		.uv(113, 132).cuboid(-10.0F, -24.0F, 4.0F, 1.0F, 5.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData LeftSidepod = modelPartData.addChild("LeftSidepod", ModelPartBuilder.create().uv(106, 207).cuboid(-11.0F, -19.0F, -9.0F, 4.0F, 1.0F, 6.0F, new Dilation(-0.01F))
		.uv(191, 145).cuboid(-10.0F, -19.0F, -2.0F, 1.0F, 15.0F, 19.0F, new Dilation(0.0F))
		.uv(84, 156).cuboid(-11.0F, -15.0F, 2.0F, 1.0F, 11.0F, 25.0F, new Dilation(-0.01F))
		.uv(0, 139).cuboid(-12.0F, -10.0F, 21.0F, 1.0F, 7.0F, 31.0F, new Dilation(-0.01F))
		.uv(31, 193).cuboid(-13.0F, -8.0F, 23.0F, 1.0F, 1.0F, 23.0F, new Dilation(-0.01F))
		.uv(0, 182).cuboid(-16.0F, -19.0F, -7.0F, 5.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(184, 67).cuboid(-15.0F, -19.0F, -7.0F, 4.0F, 1.0F, 4.0F, new Dilation(-0.01F))
		.uv(238, 267).cuboid(-15.0F, -19.0F, -3.0F, 6.0F, 1.0F, 5.0F, new Dilation(-0.01F))
		.uv(264, 159).cuboid(-14.0F, -18.0F, -3.0F, 5.0F, 4.0F, 5.0F, new Dilation(-0.01F))
		.uv(210, 121).cuboid(-17.0F, -19.0F, 2.0F, 8.0F, 2.0F, 15.0F, new Dilation(-0.01F))
		.uv(230, 17).cuboid(-16.0F, -14.0F, 2.0F, 7.0F, 2.0F, 15.0F, new Dilation(-0.01F))
		.uv(0, 237).cuboid(-14.0F, -12.0F, 5.0F, 5.0F, 2.0F, 15.0F, new Dilation(-0.01F))
		.uv(112, 168).cuboid(-13.0F, -10.0F, 7.0F, 4.0F, 2.0F, 24.0F, new Dilation(-0.01F))
		.uv(35, 177).cuboid(-16.0F, -10.0F, 21.0F, 4.0F, 1.0F, 10.0F, new Dilation(-0.01F))
		.uv(173, 0).cuboid(-17.0F, -17.0F, 2.0F, 8.0F, 3.0F, 19.0F, new Dilation(0.01F))
		.uv(210, 103).cuboid(-17.0F, -16.0F, 12.0F, 8.0F, 2.0F, 15.0F, new Dilation(-0.01F))
		.uv(202, 190).cuboid(-17.0F, -14.0F, 17.0F, 8.0F, 2.0F, 16.0F, new Dilation(-0.01F))
		.uv(181, 65).cuboid(-16.0F, -12.0F, 20.0F, 8.0F, 2.0F, 19.0F, new Dilation(-0.01F))
		.uv(229, 227).cuboid(-15.0F, -10.0F, 29.0F, 7.0F, 2.0F, 15.0F, new Dilation(0.0F))
		.uv(200, 225).cuboid(-15.0F, -3.0F, -5.0F, 7.0F, 2.0F, 15.0F, new Dilation(-0.01F))
		.uv(104, 124).cuboid(-14.0F, -5.0F, -6.0F, 6.0F, 2.0F, 30.0F, new Dilation(-0.01F))
		.uv(149, 152).cuboid(-13.0F, -6.0F, -8.0F, 5.0F, 1.0F, 27.0F, new Dilation(-0.01F))
		.uv(136, 195).cuboid(-13.0F, -7.0F, -8.0F, 5.0F, 1.0F, 20.0F, new Dilation(-0.01F))
		.uv(212, 145).cuboid(-13.0F, -8.0F, -9.0F, 5.0F, 1.0F, 17.0F, new Dilation(-0.01F))
		.uv(0, 254).cuboid(-11.0F, -10.0F, -9.0F, 3.0F, 2.0F, 10.0F, new Dilation(-0.01F))
		.uv(171, 223).cuboid(-15.0F, -3.0F, 10.0F, 7.0F, 2.0F, 15.0F, new Dilation(-0.01F))
		.uv(243, 258).cuboid(-14.0F, -3.0F, 25.0F, 6.0F, 2.0F, 7.0F, new Dilation(-0.01F))
		.uv(71, 0).cuboid(-13.0F, -3.0F, 32.0F, 5.0F, 2.0F, 11.0F, new Dilation(-0.01F))
		.uv(0, 150).cuboid(-12.0F, -3.0F, 43.0F, 4.0F, 2.0F, 11.0F, new Dilation(-0.01F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData RightSidepod = modelPartData.addChild("RightSidepod", ModelPartBuilder.create().uv(56, 147).cuboid(7.0F, -19.0F, -9.0F, 4.0F, 1.0F, 6.0F, new Dilation(-0.01F))
		.uv(0, 0).cuboid(9.0F, -19.0F, -2.0F, 1.0F, 15.0F, 19.0F, new Dilation(0.0F))
		.uv(154, 84).cuboid(10.0F, -15.0F, 2.0F, 1.0F, 11.0F, 25.0F, new Dilation(-0.01F))
		.uv(45, 132).cuboid(11.0F, -10.0F, 21.0F, 1.0F, 7.0F, 31.0F, new Dilation(-0.01F))
		.uv(81, 192).cuboid(12.0F, -8.0F, 23.0F, 1.0F, 1.0F, 23.0F, new Dilation(-0.01F))
		.uv(0, 177).cuboid(11.0F, -19.0F, -7.0F, 5.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(162, 84).cuboid(11.0F, -19.0F, -7.0F, 4.0F, 1.0F, 4.0F, new Dilation(-0.01F))
		.uv(111, 266).cuboid(9.0F, -19.0F, -3.0F, 6.0F, 1.0F, 5.0F, new Dilation(-0.01F))
		.uv(144, 261).cuboid(9.0F, -18.0F, -3.0F, 5.0F, 4.0F, 5.0F, new Dilation(-0.01F))
		.uv(202, 208).cuboid(9.0F, -19.0F, 2.0F, 8.0F, 2.0F, 15.0F, new Dilation(-0.01F))
		.uv(21, 220).cuboid(9.0F, -14.0F, 2.0F, 7.0F, 2.0F, 15.0F, new Dilation(-0.01F))
		.uv(236, 34).cuboid(9.0F, -12.0F, 5.0F, 5.0F, 2.0F, 15.0F, new Dilation(-0.01F))
		.uv(166, 25).cuboid(9.0F, -10.0F, 7.0F, 4.0F, 2.0F, 24.0F, new Dilation(-0.01F))
		.uv(124, 53).cuboid(12.0F, -10.0F, 21.0F, 4.0F, 1.0F, 10.0F, new Dilation(-0.01F))
		.uv(78, 132).cuboid(9.0F, -17.0F, 2.0F, 8.0F, 3.0F, 19.0F, new Dilation(0.01F))
		.uv(171, 206).cuboid(9.0F, -16.0F, 12.0F, 8.0F, 2.0F, 15.0F, new Dilation(-0.01F))
		.uv(198, 22).cuboid(9.0F, -14.0F, 17.0F, 8.0F, 2.0F, 16.0F, new Dilation(-0.01F))
		.uv(0, 177).cuboid(8.0F, -12.0F, 20.0F, 8.0F, 2.0F, 19.0F, new Dilation(-0.01F))
		.uv(142, 216).cuboid(8.0F, -10.0F, 29.0F, 7.0F, 2.0F, 15.0F, new Dilation(0.0F))
		.uv(98, 216).cuboid(8.0F, -3.0F, -5.0F, 7.0F, 2.0F, 15.0F, new Dilation(-0.01F))
		.uv(124, 35).cuboid(8.0F, -5.0F, -6.0F, 6.0F, 2.0F, 30.0F, new Dilation(-0.01F))
		.uv(146, 124).cuboid(8.0F, -6.0F, -8.0F, 5.0F, 1.0F, 27.0F, new Dilation(-0.01F))
		.uv(106, 194).cuboid(8.0F, -7.0F, -8.0F, 5.0F, 1.0F, 20.0F, new Dilation(-0.01F))
		.uv(209, 40).cuboid(8.0F, -8.0F, -9.0F, 5.0F, 1.0F, 17.0F, new Dilation(-0.01F))
		.uv(79, 253).cuboid(8.0F, -10.0F, -9.0F, 3.0F, 2.0F, 10.0F, new Dilation(-0.01F))
		.uv(216, 58).cuboid(8.0F, -3.0F, 10.0F, 7.0F, 2.0F, 15.0F, new Dilation(-0.01F))
		.uv(198, 40).cuboid(8.0F, -3.0F, 25.0F, 6.0F, 2.0F, 7.0F, new Dilation(-0.01F))
		.uv(68, 66).cuboid(8.0F, -3.0F, 32.0F, 5.0F, 2.0F, 11.0F, new Dilation(-0.01F))
		.uv(0, 137).cuboid(8.0F, -3.0F, 43.0F, 4.0F, 2.0F, 11.0F, new Dilation(-0.01F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData ConnectToBack = modelPartData.addChild("ConnectToBack", ModelPartBuilder.create().uv(166, 51).cuboid(-29.0F, 3.6F, 77.0F, 28.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(111, 164).cuboid(-29.0F, 3.6F, 80.0F, 28.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 133).cuboid(-29.0F, 1.1F, 81.0F, 28.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(14.0F, 11.0F, -21.0F));

		ModelPartData cube_r5 = ConnectToBack.addChild("cube_r5", ModelPartBuilder.create().uv(124, 91).cuboid(-3.0F, -1.0F, -1.0F, 14.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-24.0F, 5.1F, 83.0F, 0.0495F, -0.4321F, -0.1894F));

		ModelPartData cube_r6 = ConnectToBack.addChild("cube_r6", ModelPartBuilder.create().uv(210, 140).cuboid(-1.0F, -2.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-27.0F, 4.0F, 78.0F, -0.2026F, 0.6714F, -0.3366F));

		ModelPartData cube_r7 = ConnectToBack.addChild("cube_r7", ModelPartBuilder.create().uv(95, 253).cuboid(-1.0F, -2.0F, -1.0F, 10.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-27.0F, 5.0F, 75.0F, 0.196F, 0.6286F, 0.3257F));

		ModelPartData cube_r8 = ConnectToBack.addChild("cube_r8", ModelPartBuilder.create().uv(129, 32).cuboid(-11.0F, -1.0F, -1.0F, 14.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 5.1F, 83.0F, 0.0495F, 0.4321F, 0.1894F));

		ModelPartData cube_r9 = ConnectToBack.addChild("cube_r9", ModelPartBuilder.create().uv(241, 97).cuboid(-15.0F, -2.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 4.0F, 78.0F, -0.2026F, -0.6714F, 0.3366F));

		ModelPartData cube_r10 = ConnectToBack.addChild("cube_r10", ModelPartBuilder.create().uv(258, 237).cuboid(-9.0F, -2.0F, -1.0F, 10.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 5.0F, 75.0F, 0.196F, -0.6286F, -0.3257F));

		ModelPartData TopVent = modelPartData.addChild("TopVent", ModelPartBuilder.create().uv(62, 55).cuboid(-6.0F, -21.0F, 13.0F, 12.0F, 2.0F, 38.0F, new Dilation(0.0F))
		.uv(71, 0).cuboid(-6.0F, -22.0F, 13.0F, 12.0F, 1.0F, 34.0F, new Dilation(0.0F))
		.uv(102, 95).cuboid(-6.0F, -23.0F, 13.0F, 12.0F, 1.0F, 28.0F, new Dilation(0.0F))
		.uv(113, 146).cuboid(-3.0F, -25.0F, 11.0F, 6.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(144, 168).cuboid(-3.0F, -30.0F, 11.0F, 6.0F, 1.0F, 10.0F, new Dilation(0.0F))
		.uv(169, 240).cuboid(-3.0F, -29.0F, 14.0F, 6.0F, 6.0F, 12.0F, new Dilation(0.01F))
		.uv(166, 206).cuboid(-3.0F, -28.0F, 26.0F, 6.0F, 5.0F, 4.0F, new Dilation(0.01F))
		.uv(183, 136).cuboid(-3.0F, -26.0F, 30.0F, 6.0F, 3.0F, 5.0F, new Dilation(0.01F))
		.uv(236, 51).cuboid(-3.0F, -25.0F, 35.0F, 6.0F, 2.0F, 4.0F, new Dilation(0.01F))
		.uv(71, 13).cuboid(-3.0F, -29.0F, 11.0F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F))
		.uv(71, 0).cuboid(2.0F, -29.0F, 11.0F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F))
		.uv(34, 203).cuboid(3.0F, -27.0F, 14.0F, 1.0F, 4.0F, 9.0F, new Dilation(0.0F))
		.uv(80, 233).cuboid(3.0F, -25.0F, 15.0F, 2.0F, 2.0F, 18.0F, new Dilation(0.0F))
		.uv(183, 121).cuboid(3.0F, -24.0F, 15.0F, 2.0F, 1.0F, 23.0F, new Dilation(0.01F))
		.uv(136, 194).cuboid(-4.0F, -27.0F, 14.0F, 1.0F, 4.0F, 9.0F, new Dilation(0.0F))
		.uv(232, 207).cuboid(-5.0F, -25.0F, 15.0F, 2.0F, 2.0F, 18.0F, new Dilation(0.0F))
		.uv(183, 97).cuboid(-5.0F, -24.0F, 15.0F, 2.0F, 1.0F, 23.0F, new Dilation(0.01F))
		.uv(13, 103).cuboid(-0.5F, -30.0F, 21.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(85, 55).cuboid(-0.5F, -29.0F, 25.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(68, 54).cuboid(-0.5F, -28.0F, 26.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(68, 47).cuboid(-0.5F, -27.0F, 30.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(38, 148).cuboid(-0.5F, -26.0F, 35.0F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 50).cuboid(-0.5F, -25.0F, 39.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(36, 38).cuboid(-0.5F, -24.0F, 41.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(142, 53).cuboid(-0.5F, -23.0F, 43.0F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(19, 137).cuboid(-0.5F, -22.0F, 47.0F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(173, 0).cuboid(-0.5F, -21.0F, 46.0F, 1.0F, 4.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 69).cuboid(-5.5F, -19.0F, 48.0F, 11.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData DRS = modelPartData.addChild("DRS", ModelPartBuilder.create().uv(136, 207).cuboid(-6.0F, 0.0F, 3.0F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(89, 66).cuboid(-4.0F, -3.0F, 4.0F, 1.0F, 3.0F, 4.0F, new Dilation(0.0F))
		.uv(68, 66).cuboid(-4.0F, -7.0F, 4.5F, 1.0F, 5.0F, 4.0F, new Dilation(-0.01F))
		.uv(92, 0).cuboid(-4.0F, -7.5F, 4.75F, 1.0F, 2.0F, 5.0F, new Dilation(-0.02F))
		.uv(71, 35).cuboid(-10.5F, -1.0F, 7.0F, 14.0F, 1.0F, 6.0F, new Dilation(0.01F))
		.uv(33, 158).cuboid(-12.5F, -2.0F, 12.0F, 18.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(17, 51).cuboid(3.5F, -2.0F, 7.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.01F))
		.uv(157, 265).cuboid(4.5F, -3.0F, 7.0F, 3.0F, 1.0F, 7.0F, new Dilation(0.01F))
		.uv(261, 193).cuboid(6.5F, -4.0F, 7.0F, 3.0F, 1.0F, 7.0F, new Dilation(0.01F))
		.uv(81, 199).cuboid(8.5F, -3.0F, 7.0F, 1.0F, 3.0F, 10.0F, new Dilation(0.01F))
		.uv(111, 168).cuboid(-16.5F, -3.0F, 7.0F, 1.0F, 3.0F, 10.0F, new Dilation(0.01F))
		.uv(56, 199).cuboid(-15.5F, 0.0F, 7.0F, 1.0F, 5.0F, 10.0F, new Dilation(0.01F))
		.uv(183, 121).cuboid(7.5F, 0.0F, 7.0F, 1.0F, 5.0F, 10.0F, new Dilation(0.01F))
		.uv(106, 194).cuboid(6.5F, 5.0F, 7.0F, 1.0F, 4.0F, 9.0F, new Dilation(0.01F))
		.uv(134, 35).cuboid(-14.5F, 5.0F, 7.0F, 1.0F, 4.0F, 9.0F, new Dilation(0.01F))
		.uv(0, 193).cuboid(-13.5F, 8.0F, 11.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.01F))
		.uv(159, 130).cuboid(1.5F, 8.0F, 11.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.01F))
		.uv(36, 217).cuboid(-1.5F, 7.0F, 12.0F, 8.0F, 1.0F, 2.0F, new Dilation(0.01F))
		.uv(134, 48).cuboid(-13.5F, 7.0F, 12.0F, 8.0F, 1.0F, 2.0F, new Dilation(0.01F))
		.uv(184, 72).cuboid(-6.5F, 8.0F, 12.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.01F))
		.uv(83, 265).cuboid(-14.5F, -3.0F, 7.0F, 3.0F, 1.0F, 7.0F, new Dilation(0.01F))
		.uv(264, 168).cuboid(-16.5F, -4.0F, 7.0F, 3.0F, 1.0F, 7.0F, new Dilation(0.01F))
		.uv(0, 50).cuboid(-11.5F, -2.0F, 7.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.01F))
		.uv(68, 57).cuboid(-10.5F, -2.0F, 10.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.01F))
		.uv(68, 54).cuboid(2.5F, -2.0F, 10.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.01F)), ModelTransform.pivot(3.5F, 6.0F, 53.0F));

		ModelPartData cube_r11 = DRS.addChild("cube_r11", ModelPartBuilder.create().uv(92, 7).cuboid(-7.0F, 16.0F, -8.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-12.3F, -21.0F, 5.5F, 0.8651F, 0.1334F, -0.1129F));

		ModelPartData cube_r12 = DRS.addChild("cube_r12", ModelPartBuilder.create().uv(95, 31).cuboid(4.0F, 16.0F, -8.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.3F, -21.0F, 5.5F, 0.8651F, -0.1334F, 0.1129F));

		ModelPartData cube_r13 = DRS.addChild("cube_r13", ModelPartBuilder.create().uv(115, 95).cuboid(-4.0F, -1.0F, 1.0F, 1.0F, 1.0F, 5.0F, new Dilation(-0.03F)), ModelTransform.of(0.0F, -7.0F, 8.25F, -0.5672F, 0.0F, 0.0F));

		ModelPartData DRSFlap = modelPartData.addChild("DRSFlap", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 1.0F, 67.0F));

		ModelPartData DRSFlap_r1 = DRSFlap.addChild("DRSFlap_r1", ModelPartBuilder.create().uv(129, 25).cuboid(-17.0F, 16.0F, -10.0F, 24.0F, 1.0F, 6.0F, new Dilation(0.01F)), ModelTransform.of(5.0F, -16.0F, -8.0F, 0.8727F, 0.0F, 0.0F));

		ModelPartData SteeringWheel = modelPartData.addChild("SteeringWheel", ModelPartBuilder.create().uv(173, 12).cuboid(-4.0F, -1.0F, -2.0F, 8.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 187).cuboid(-4.0F, 2.0F, -2.0F, 8.0F, 2.0F, 1.0F, new Dilation(0.05F))
		.uv(0, 17).cuboid(-4.0F, -1.0F, -2.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.05F))
		.uv(26, 66).cuboid(2.0F, 0.0F, -2.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.05F))
		.uv(25, 54).cuboid(-4.0F, 0.0F, -2.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.05F))
		.uv(68, 66).cuboid(-5.0F, 0.0F, -2.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.05F))
		.uv(38, 34).cuboid(4.0F, 0.0F, -2.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.05F)), ModelTransform.pivot(0.0F, 9.0F, -6.0F));

		ModelPartData Mirrors = modelPartData.addChild("Mirrors", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r14 = Mirrors.addChild("cube_r14", ModelPartBuilder.create().uv(19, 17).cuboid(-8.0F, 0.0F, -1.0F, 9.0F, 0.0F, 2.0F, new Dilation(-0.01F))
		.uv(0, 0).cuboid(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(-0.01F))
		.uv(71, 8).cuboid(-8.0F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(-0.01F)), ModelTransform.of(-8.0F, -19.9F, -7.7F, 0.0F, 0.2618F, 0.0F));

		ModelPartData cube_r15 = Mirrors.addChild("cube_r15", ModelPartBuilder.create().uv(71, 21).cuboid(5.0F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(-0.01F))
		.uv(111, 53).cuboid(-1.0F, 0.0F, -1.0F, 9.0F, 0.0F, 2.0F, new Dilation(-0.01F))
		.uv(0, 34).cuboid(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(-0.01F)), ModelTransform.of(8.0F, -19.9F, -7.7F, 0.0F, -0.2618F, 0.0F));

		ModelPartData Top = modelPartData.addChild("Top", ModelPartBuilder.create().uv(-1, -2).cuboid(-0.5F, -32.0F, 12.0F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(-3, -2).cuboid(-2.5F, -33.0F, 12.0F, 5.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(-2, -1).cuboid(2.5F, -27.0F, 13.0F, 4.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(-2, -1).cuboid(-6.5F, -27.0F, 13.0F, 4.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(-76, -62).cuboid(-15.0F, 0.0F, -31.0F, 30.0F, 1.0F, 64.0F, new Dilation(0.0F))
		.uv(-76, -62).cuboid(-15.0F, -5.0F, -31.0F, 30.0F, 1.0F, 64.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 512, 512);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Player.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		FLWheel.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		FRWheel.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		BLWheel.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		BRWheel.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		FrontWing.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Seat.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Headrest.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		EngineSide.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Back.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Halo.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		LeftSidepod.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		RightSidepod.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		ConnectToBack.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		TopVent.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		DRS.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		DRSFlap.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		SteeringWheel.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Mirrors.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Top.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bb_main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}