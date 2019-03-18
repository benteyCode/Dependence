package com.bentey.plugin.depend

class DependComp {

    String supportVersion = '28.0.0'

    boolean latest = false

    /**
     * 官方 ==============================
     */
    def support_v4() {
        return support_v4(supportVersion)
    }

    def support_v4(String version) {
        return "com.android.support:support-v4:${version}"
    }

    def appcompat_v7() {
        return appcompat_v7(supportVersion)
    }

    def appcompat_v7(String version) {
        return "com.android.support:appcompat-v7:${version}"
    }

    def support_annotations() {
        return support_annotations(supportVersion)
    }

    def support_annotations(String version) {
        return "com.android.support:support-annotations:${version}"
    }

    def support_compat() {
        return support_compat(supportVersion)
    }

    def support_compat(String version) {
        return "com.android.support:support-compat:${version}"
    }

    def cardview_v7() {
        return cardview_v7(supportVersion)
    }

    def cardview_v7(String version) {
        return "com.android.support:cardview-v7:${version}"
    }

    def recyclerview_v7() {
        return recyclerview_v7(supportVersion)
    }

    def recyclerview_v7(String version) {
        return "com.android.support:recyclerview-v7:${version}"
    }

    def design() {
        return design(supportVersion)
    }

    def design(String version) {
        return "com.android.support:design:${version}"
    }

    /**
     * okhttp网络请求库 ==============================
     */
    def okhttp() {
        String version = latest ? 'latest.release' : '3.10.0'
        return okhttp(version)
    }

    def okhttp(String version) {
        return "com.squareup.okhttp3:okhttp:${version}"
    }

    def okhttp_log() {
        String version = latest ? 'latest.release' : '3.10.0'
        return okhttp_log(version)
    }

    def okhttp_log(String version) {
        return "com.squareup.okhttp3:logging-interceptor:${version}"
    }

    def okhttp_urlconnection() {
        String version = latest ? 'latest.release' : '3.10.0'
        return okhttp_urlconnection(version)
    }

    def okhttp_urlconnection(String version) {
        return "com.squareup.okhttp3:okhttp-urlconnection:${version}"
    }

    /**
     * retrofit网络请求库 ==============================
     */
    String retrofitVersion = '2.4.0'

    def retrofit() {
        String version = latest ? 'latest.release' : retrofitVersion
        return retrofit(version)
    }

    def retrofit(String version) {
        return "com.squareup.retrofit2:retrofit:${version}"
    }

    @Deprecated
    def retrofit_rxjava_adapter() {
        String version = latest ? 'latest.release' : retrofitVersion
        return retrofit_rxjava_adapter(version)
    }

    @Deprecated
    def retrofit_rxjava_adapter(String version) {
        return "com.squareup.retrofit2:adapter-rxjava:${version}"
    }

    def retrofit_rxjava2_adapter() {
        String version = latest ? 'latest.release' : retrofitVersion
        return retrofit_rxjava2_adapter(version)
    }

    def retrofit_rxjava2_adapter(String version) {
        return "com.squareup.retrofit2:adapter-rxjava2:${version}"
    }

    def retrofit_gson() {
        String version = latest ? 'latest.release' : retrofitVersion
        return retrofit_gson(version)
    }

    def retrofit_gson(String version) {
        return "com.squareup.retrofit2:converter-gson:${version}"
    }

    def retrofit_jackson() {
        String version = latest ? 'latest.release' : retrofitVersion
        return retrofit_jackson(version)
    }

    def retrofit_jackson(String version) {
        return "com.squareup.retrofit2:converter-jackson:${version}"
    }

    def retrofit_scalars() {
        String version = latest ? 'latest.release' : retrofitVersion
        return retrofit_scalars(version)
    }

    def retrofit_scalars(String version) {
        return "com.squareup.retrofit2:converter-scalars:${version}"
    }

    def reactivenetwork_rx2() {
        String version = latest ? 'latest.release' : '0.12.3'
        return reactivenetwork_rx2(version)
    }

    def reactivenetwork_rx2(String version) {
        return "com.github.pwittchen:reactivenetwork-rx2:${version}"
    }

    /**
     * 图片加载 ==============================
     * @return
     */
    def glide() {
        String version = latest ? 'latest.release' : '3.8.0'
        return glide(version)
    }

    def glide(String version) {
        return "com.github.bumptech.glide:glide:${version}"
    }

    def glide_apt() {
        String version = latest ? 'latest.release' : '3.8.0'
        return glide_apt(version)
    }

    def glide_apt(String version) {
        return "com.github.bumptech.glide:compiler:${version}"
    }

    def glide_okhttp_integration() {
        String version = latest ? 'latest.release' : '1.5.0'
        return glide_okhttp_integration(version)
    }

    def glide_okhttp_integration(String version) {
        return "com.github.bumptech.glide:okhttp3-integration:${version}"
    }

    def glide_transformations() {
        String version = latest ? 'latest.release' : '2.0.1'
        return glide_transformations(version)
    }

    def glide_transformations(String version) {
        return "jp.wasabeef:glide-transformations:${version}"
    }
}