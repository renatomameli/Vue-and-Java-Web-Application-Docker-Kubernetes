<script setup>
defineProps({
  name: String,
  logo: String,
  color: String
})
</script>

<template>
  <router-link to="/stock-details" style="text-decoration: none">
  <div class="stock-overview-item">
    <img :src="'src/assets/'+logo">
    <h3 :style="nameStyle" class="stock-name">{{name}}</h3>
  </div>
  </router-link>
</template>

<script>
export default {
  name: "StockOverviewItem",
  props: ['color'],
  computed: {
    nameStyle () {
      return 'color: ' +  this.color;
    },
  },

}
</script>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Roboto&display=swap');

img {
    width: 80px;
  }

  .stock-overview-item{
    display: flex;
    background: white;
    padding: 20px;
  }

  .stock-name {
    font-family: 'Roboto', sans-serif;
    font-size: 2em;
    padding-left: 10px;
  }

  .stock-overview-item:hover {
    box-shadow: 10px 10px 10px gray;
  }

</style>
