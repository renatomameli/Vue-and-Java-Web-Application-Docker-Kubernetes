<template>
  <div>
    <h1>Tesla</h1>
    <p>{{prediction}}</p>
    <router-link to="/">Go back to stock overview</router-link>

  </div>
</template>

<script>
export default {
  name: "StockDetails",
  data() {
    return {
      prediction: ""
    };
  },
  created() {
    this.getData();
  },
  methods: {
    async getData() {
      try {
        const response = await fetch("http://localhost:8080/stock-prediction");
        const data = await response.text();
        console.log(data);
        this.prediction = data;
        console.log(this.prediction)
      } catch (error) {
        console.error(error);
      }
    }
  }
};
</script>

<style scoped>

</style>
