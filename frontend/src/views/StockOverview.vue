<script setup>
import StockOverviewItem from "@/components/StockOverviewItem.vue";

defineProps({
  msg: {
    type: String,
    required: true
  }
})
</script>

<template>
  <div>
    <div class="stock-overview-container">
      <div class="stock-overview-column">
        <StockOverviewItem
            logo="tesla.png"
            name="Tesla"
            color="#E82127"
        >
        </StockOverviewItem>
      </div>
      <div class="stock-overview-column">
        <StockOverviewItem
          logo="spotify.png"
          name="Spotify"
          color="#1DB954">
        </StockOverviewItem>
      </div>
    </div>
  </div>
</template>

<style scoped>
.stock-overview-container {
  display: flex;
  margin: 100px;
  gap: 150px;
}

.stock-overview-column {
  flex: 50%;
}
</style>
