package com.fengshui.sinoeats.client;

import com.fengshui.sinoeats.entities.TomatoEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderTomatoFactory implements IRenderFactory<TomatoEntity> {

    @Override
    public EntityRenderer<TomatoEntity> createRenderFor(EntityRendererManager manager) {
        return new SpriteRenderer<>(manager, Minecraft.getInstance().getItemRenderer());
    }

}