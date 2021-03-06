package com.p683ss.android.ugc.effectmanager.effect.model;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel */
public class EffectChannelModel {
    private List<EffectCategoryModel> category;
    private List<Effect> collection;
    private List<Effect> effects;
    private String front_effect_id;
    private EffectPanelModel panel;
    private String rear_effect_id;
    private List<String> url_prefix;
    private String version;

    public List<EffectCategoryModel> getCategory() {
        return this.category;
    }

    public List<Effect> getCollection() {
        return this.collection;
    }

    public List<Effect> getEffects() {
        return this.effects;
    }

    public String getFront_effect_id() {
        return this.front_effect_id;
    }

    public EffectPanelModel getPanel() {
        return this.panel;
    }

    public String getRear_effect_id() {
        return this.rear_effect_id;
    }

    public List<String> getUrlPrefix() {
        return this.url_prefix;
    }

    public String getVersion() {
        return this.version;
    }

    public EffectChannelModel() {
        this.effects = new ArrayList();
        this.category = new ArrayList();
        this.url_prefix = new ArrayList();
    }

    public boolean checkValued() {
        if (this.effects == null) {
            this.effects = new ArrayList();
        }
        if (this.category == null) {
            this.category = new ArrayList();
        }
        if (this.panel == null) {
            this.panel = new EffectPanelModel();
        }
        if (this.collection == null) {
            this.collection = new ArrayList();
        }
        this.panel.checkValued();
        return true;
    }

    public void setCategory(List<EffectCategoryModel> list) {
        this.category = list;
    }

    public void setCollection(List<Effect> list) {
        this.collection = list;
    }

    public void setEffects(List<Effect> list) {
        this.effects = list;
    }

    public void setFront_effect_id(String str) {
        this.front_effect_id = str;
    }

    public void setPanel(EffectPanelModel effectPanelModel) {
        this.panel = effectPanelModel;
    }

    public void setRear_effect_id(String str) {
        this.rear_effect_id = str;
    }

    public void setUrlPrefix(List<String> list) {
        this.url_prefix = list;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public EffectChannelModel(String str, List<Effect> list, List<EffectCategoryModel> list2) {
        this.version = str;
        this.effects = list;
        this.category = list2;
    }
}
