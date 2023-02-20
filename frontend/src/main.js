import { createApp } from 'vue';
import App from './App.vue';
import {createRouter, createWebHashHistory} from "vue-router";
import StockOverview from "@/views/StockOverview.vue";
import StockDetails from "@/views/StockDetails.vue";

const app = createApp(App)
const routes = [    {path: "/", component: StockOverview},    {path: "/stock-details", component: StockDetails}]
const router = createRouter({    history: createWebHashHistory(),    routes: routes,    linkActiveClass: "active"})

app.use(router)
app.mount('#app')